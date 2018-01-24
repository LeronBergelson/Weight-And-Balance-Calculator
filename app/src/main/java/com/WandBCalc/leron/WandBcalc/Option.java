package com.WandBCalc.leron.WandBcalc;

 import android.content.Intent;
 import android.os.Bundle;
 import android.support.v4.app.FragmentActivity;
 import android.view.View;
 import android.widget.Button;

 import com.google.android.gms.leron.bandwcalc.R;
 import com.google.android.gms.ads.AdRequest;
 import com.google.android.gms.ads.AdView;


public class Option extends FragmentActivity  {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);
        mAdView = (AdView) findViewById(R.id.ad_view);

        AdRequest adRequest = new AdRequest.Builder().build();

        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);


        Button onebaggage = (Button)findViewById(R.id.OneBaggage);
        Button twobaggage = (Button)findViewById(R.id.twobaggage);

        onebaggage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchViewInt = new Intent(Option.this, WANDBsetter.class);
                startActivityForResult(switchViewInt, 1);

            }

    });
        twobaggage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchViewInt = new Intent(Option.this, WANDBsetter2.class);
                startActivityForResult(switchViewInt, 2);

            }
        });

}
    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}

