package com.example.vinmar.portfolio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/*    public void makeTheToastOnButtonClick(Button button, final Context context, final String string)
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, string,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    public void displayToast(View view)
    {
        Button viewButton = (Button) view;
        String buttonText = (String) viewButton.getText();
        Context context = getApplicationContext();

        String toast_message = getString(R.string.button_laucn_app)+" "+ buttonText;
        int toast_duration = Toast.LENGTH_SHORT;

        Toast t = Toast.makeText(context, toast_message, toast_duration);
        t.show();

        Intent intent;

        if(buttonText.equalsIgnoreCase("spotify streamer"))
        {
            intent = new Intent(context, SpotifyStreamer.class);
            startActivity(intent);
        }
    }


}
