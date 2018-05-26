package holmes.holmesy.starbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {


    public static final String EXTRA_DRINKID = "drinkid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drink_activity);


            int drinkID = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
            Drink drink = Drink.drinks[drinkID];

        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        TextView desc = findViewById(R.id.desc);
        desc.setText(drink.getDesc());






    }

}
