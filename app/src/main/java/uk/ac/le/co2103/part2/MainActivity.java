package uk.ac.le.co2103.part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;
    private List<ShoppingList> shoppingLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        shoppingLists = generateDummyShoppingLists(); // Method to generate dummy data
        adapter = new ShoppingListAdapter(shoppingLists);
        recyclerView.setAdapter(adapter);
    }

    private List<ShoppingList> generateDummyShoppingLists() {
        List<ShoppingList> lists = new ArrayList<>();
        // Add dummy shopping lists here
        lists.add(new ShoppingList(1, "Groceries", R.drawable.ic_launcher_background));
        lists.add(new ShoppingList(2, "Electronics", R.drawable.ic_launcher_background));
        return lists;
    }
}
