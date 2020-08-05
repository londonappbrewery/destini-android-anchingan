package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mIndex;
    ChoiceSet[] mChoiceSets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mIndex = 0;

        mChoiceSets = new ChoiceSet[] {
                new ChoiceSet(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
                new ChoiceSet(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
                new ChoiceSet(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
                new ChoiceSet(R.string.T4_End, 0, 0),
                new ChoiceSet(R.string.T5_End, 0, 0),
                new ChoiceSet(R.string.T6_End, 0, 0),
        };

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mIndex){
                    case 0:
                    case 1:
                        mIndex = 2;
                        break;
                    case 2:
                        mIndex = 5;
                        break;
                }
                updateUI();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mIndex){
                    case 0:
                        mIndex = 1;
                        break;
                    case 1:
                        mIndex = 3;
                        break;
                    case 2:
                        mIndex = 5;
                        break;
                }
            }
        });
    }

    private void updateUI(){
        mTextView.setText(mChoiceSets[mIndex].getStoryID());
        int buttonTopID = mChoiceSets[mIndex].getChoice1ID();
        if (buttonTopID != 0)
            mButtonTop.setText(buttonTopID);
        else {
            mButtonTop.setText("");
            mButtonTop.setVisibility(View.INVISIBLE);
        }
        int buttonBottomID = mChoiceSets[mIndex].getChoice2ID();
        if (buttonBottomID != 0)
            mButtonBottom.setText(buttonBottomID);
        else {
            mButtonBottom.setText("");
            mButtonBottom.setVisibility(View.INVISIBLE);
        }
    }
}
