package c.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button startanim,stopanim;
    Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textview);
        anim= AnimationUtils.loadAnimation(this,R.anim.animation);
        startanim=(Button)findViewById(R.id.startanim);
        stopanim=(Button)findViewById(R.id.stopanim);
        startanim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.startAnimation(anim);
                //Starting Animation
                startanim.setVisibility(view.INVISIBLE);
                stopanim.setVisibility(view.VISIBLE);
            }
        });

    stopanim.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Stoping Animation
            textView.clearAnimation();
            stopanim.setVisibility(view.INVISIBLE);
            startanim.setVisibility(view.VISIBLE);
        }
    });
    }

}
