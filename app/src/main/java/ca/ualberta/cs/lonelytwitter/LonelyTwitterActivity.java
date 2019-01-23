package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.model.Tweet;

/** The class to manage the main activity
 * @author wz (main) and vonderoh
 */
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file1.json";
	private EditText bodyText;
	private ListView oldTweetsList;
	private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;
	
	/** Called when the activity is first created.
	 *  Used to set up the activity
	 * @param savedInstanceState The state from the last application run
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);

				String text = bodyText.getText().toString();
				Tweet tweet = new Tweet(text);
				tweetList.add(tweet);
				bodyText.setText("");

				adapter.notifyDataSetChanged();
				saveInFile();

			}
		});

		clearButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);

				tweetList.clear();
				bodyText.setText("");

				adapter.notifyDataSetChanged();
				saveInFile();

			}
		});
	}

	/** Called when the activity is started
	 *  Used to set up the old tweet list adapter
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

	/** Loads the tweet list from file
	 */
	private void loadFromFile() {
		try {
			FileInputStream fis = new FileInputStream(new File(getFilesDir(), FILENAME));
			Reader reader = new FileReader(fis.getFD());

			Type listType = new TypeToken<ArrayList<Tweet>>(){}.getType();
			Gson gson = new Gson();

			tweetList = gson.fromJson(reader, listType);

			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** Saves the tweet list to file
	 */
	private void saveInFile() {
		try {
			FileOutputStream fos = new FileOutputStream(new File(getFilesDir(), FILENAME));
			Writer writer = new FileWriter(fos.getFD());

			Gson gson = new Gson();
			gson.toJson(tweetList,writer);

			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}