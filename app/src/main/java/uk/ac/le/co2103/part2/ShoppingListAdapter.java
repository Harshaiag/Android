package uk.ac.le.co2103.part2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShoppingListAdapter extends RecyclerView.Adapter<ShoppingListAdapter.ShoppingListViewHolder> {

    private List<ShoppingList> shoppingLists;

    public ShoppingListAdapter(List<ShoppingList> shoppingLists) {
        this.shoppingLists = shoppingLists;
    }

    @NonNull
    @Override
    public ShoppingListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shopping_list, parent, false);
        return new ShoppingListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingListViewHolder holder, int position) {
        ShoppingList shoppingList = shoppingLists.get(position);
        holder.bind(shoppingList);
    }

    @Override
    public int getItemCount() {
        return shoppingLists.size();
    }

    static class ShoppingListViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView nameTextView;

        public ShoppingListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }

        public void bind(ShoppingList shoppingList) {
            imageView.setImageResource(shoppingList.getImage());
            nameTextView.setText(shoppingList.getName());
        }
    }
}
