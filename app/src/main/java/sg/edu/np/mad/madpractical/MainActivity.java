package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean isFollowing = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logoImage = findViewById(R.id.logoImage);
        Button followButton = findViewById(R.id.btnFollow);
        followButton.setText("Follow");
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFollowing==false){
                    isFollowing=true;
                    followButton.setText("Unfollow");
                    Toast.makeText(getApplicationContext(),"following",Toast.LENGTH_SHORT).show();



                }
                else {
                    isFollowing=false;
                    followButton.setText("Follow");
                    Toast.makeText(getApplicationContext(),"stopped following",Toast.LENGTH_SHORT).show();


                }

            }
        });



        Intent recieveIntent= getIntent();
        String message=recieveIntent.getStringExtra("string1");
        TextView tv = findViewById(R.id.textView2);
        tv.setText(message);

    }
}

