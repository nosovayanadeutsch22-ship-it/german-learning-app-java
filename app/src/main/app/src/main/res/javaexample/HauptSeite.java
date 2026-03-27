import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HauptSeite extends AppCompatActivity {
    private String selectedTopic = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haupt_seite);


        final LinearLayout verbenPlay = findViewById(R.id.verbenPlay);
        final LinearLayout verbenQuiz = findViewById(R.id.verbenQuiz);

        final LinearLayout nomenPlay = findViewById(R.id.nomenPlay);
        final LinearLayout nomenQuiz = findViewById(R.id.nomenQuiz);

        final LinearLayout adjektivPlay= findViewById(R.id.adjektivPlay);
        final LinearLayout adjektivQuiz = findViewById(R.id.adjektivQuiz);



        final Button startBtn = findViewById(R.id.startBtn);

        verbenPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "verben Play";
                verbenPlay.setBackgroundResource(R.drawable.round_back_green_3);
                verbenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivQuiz.setBackgroundResource(R.drawable.round_back_3_grey);

            }
        });

        verbenQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "verben Quiz";
                verbenQuiz.setBackgroundResource(R.drawable.round_back_green_3);
                verbenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
            }
        });

        nomenPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "nomen Play";
                nomenPlay.setBackgroundResource(R.drawable.round_back_green_3);
                verbenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                verbenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
            }
        });

        nomenQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "nomen Quiz";
                nomenQuiz.setBackgroundResource(R.drawable.round_back_green_3);
                verbenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                verbenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
            }
        });

        adjektivPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "adjektiv Play";
                adjektivPlay.setBackgroundResource(R.drawable.round_back_green_3);
                verbenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                verbenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivQuiz.setBackgroundResource(R.drawable.round_back_3_grey);

            }
        });

        adjektivQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "adjektiv Quiz";
                adjektivQuiz.setBackgroundResource(R.drawable.round_back_green_3);
                verbenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                nomenQuiz.setBackgroundResource(R.drawable.round_back_3_grey);
                adjektivPlay.setBackgroundResource(R.drawable.round_back_3_grey);
                verbenPlay.setBackgroundResource(R.drawable.round_back_3_grey);

            }
        });


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopic.isEmpty()) {
                    Toast.makeText(HauptSeite.this, "Bitte wählen Sie ein Quiz aus", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent;
                    switch (selectedTopic) {
                        case "verben Play":
                            intent = new Intent(HauptSeite.this, VerbenPlayActivity.class);
                            break;
                        case "verben Quiz":
                        case "nomen Quiz":
                        case "adjektiv Quiz":
                            // Use the common QuizActivity for all quiz types
                            intent = new Intent(HauptSeite.this, QuizActivity.class);
                            break;
                        case "nomen Play":
                            intent = new Intent(HauptSeite.this, NomenPlayActivity.class);
                            break;
                        case "adjektiv Play":
                            intent = new Intent(HauptSeite.this, LernenActivity.class);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + selectedTopic);
                    }
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
