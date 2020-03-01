package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.SimpleAdapter;

public class SimpleActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple);
		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<String> teams = new ArrayList<>();
		teams.add("Liverpool");
		teams.add("Manchester City");
		teams.add("Leicester City");
		teams.add("Chelsea");

		SimpleAdapter adapter = new SimpleAdapter(teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		teamsView.setLayoutManager(layoutManager);

	}
}
