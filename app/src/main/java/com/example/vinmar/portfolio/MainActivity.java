package com.example.vinmar.portfolio;

import android.app.Activity;
import android.content.Context;
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
/*
        Button[] portfolio_buttons = new Button[6];

        portfolio_buttons[0] = (Button) findViewById(R.id.spotify_streamer_button_id);
        portfolio_buttons[1] = (Button) findViewById(R.id.scores_app_button_id);
        portfolio_buttons[2] = (Button) findViewById(R.id.library_app_button_id);
        portfolio_buttons[3] = (Button) findViewById(R.id.build_it_bigger_button_id);
        portfolio_buttons[4] = (Button) findViewById(R.id.xyz_reader_button_id);
        portfolio_buttons[5] = (Button) findViewById(R.id.capstone_button_id);
        final String toast_message = "This button will launch ";

        for (int i = 0; i < portfolio_buttons.length; i++)
        {
            makeTheToastOnButtonClick(portfolio_buttons[i], getApplicationContext(), toast_message + (String) portfolio_buttons[i].getText());
        }
*/





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
    }


}
