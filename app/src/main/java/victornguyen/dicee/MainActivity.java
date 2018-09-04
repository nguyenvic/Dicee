package victornguyen.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        final int[] diceArray = {R.drawable.dice1,  // "final" is constant. element 0
                           R.drawable.dice2,        //element 1
                           R.drawable.dice3,        //element 2
                           R.drawable.dice4,        //element 3
                           R.drawable.dice5,        //element 4
                           R.drawable.dice6};       //element 5

        rollButton.setOnClickListener(new View.OnClickListener() { //Action when button is pressed
            @Override
            public void onClick(View v) {
                Random randomNumGenerator = new Random(); //"Random" object is stored in randomNumGenerator
                int number = randomNumGenerator.nextInt(6);// "nextInt(<bound>)" is a random # 0~5 stored in "number"

                Log.d("Dicee", "The random left number is: " + (number+1)); //prints the random number. Log.D is for debug messages
                leftDice.setImageResource(diceArray[number]);

                number = randomNumGenerator.nextInt(6);
                Log.d("Dicee", "The random right number is: " + (number+1));
                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
