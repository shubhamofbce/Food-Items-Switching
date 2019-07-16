package com.example.foodgridrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView FoodCategoryRV,FoodItemsRV;
    List<foodcategories> FoodCatList;
    CardView Card1,Card2;
    public CoordinatorLayout MainCoordinator;
    Snackbar snackbar;
    List<String> FoodCart;
    View snackview;
    int quantity = 0;
    int row_index = -1;
    List<FoodItems> DrinkList,SaladsList,MeatList,DessertList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FoodCategoryRV = (RecyclerView) findViewById(R.id.food_category);
        FoodItemsRV = (RecyclerView) findViewById(R.id.food_items_rv);
        Card1 = findViewById(R.id.card1);
        Card2 = findViewById(R.id.card2);
        Card1.setBackgroundResource(R.drawable.cardnormalbg);
        Card2.setBackgroundResource(R.drawable.cardnormalbg);
        FoodCart = new ArrayList<>();

        FoodCatList = new ArrayList<>();
        DrinkList = new ArrayList<>();
        SaladsList = new ArrayList<>();
        MeatList = new ArrayList<>();
        DessertList = new ArrayList<>();
        MainCoordinator = findViewById(R.id.co_ordinator_main);

        FoodCatList.add(
                new foodcategories(
                        "Drinks",
                        R.drawable.drinkcolorlogo
                )
        );
        FoodCatList.add(
                new foodcategories(
                        "Dessert",
                        R.drawable.dessertlogoblack
                )
        );
        FoodCatList.add(
                new foodcategories(
                        "Salads",
                        R.drawable.saladlogo
                )
        );
        FoodCatList.add(
                new foodcategories(
                        "Meat",
                        R.drawable.meatlogo
                )
        );

        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );
        DrinkList.add(
                new FoodItems(
                        "Cold Drink",
                        "20",0
                )
        );

        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken",
                        "50",0
                )
        );
        MeatList.add(
                new FoodItems(
                        "Chicken tandoor",
                        "50",0
                )
        );

        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );
        SaladsList.add(
                new FoodItems(
                        "Green Salad",
                        "30",0
                )
        );

        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );
        DessertList.add(
                new FoodItems(
                        "Vanilla",
                        "10",0
                )
        );


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        FoodCategoryRV.setLayoutManager(layoutManager);
        FoodCategoryRV.setHasFixedSize(true);
        FoodAdapter adapter = new FoodAdapter(FoodCatList,this);
        FoodCategoryRV.setAdapter(adapter);
        GridLayoutManager manager = new GridLayoutManager(this, 3,
                RecyclerView.VERTICAL, false);
        FoodItemsRV.setLayoutManager(manager);
        FoodItemsRV.setHasFixedSize(true);
        FoodItemsAdapter adapter1 = new FoodItemsAdapter(DrinkList,getApplicationContext());
        FoodItemsRV.setAdapter(adapter1);

        snackbar = Snackbar.make(MainCoordinator,"",Snackbar.LENGTH_INDEFINITE);
        snackbar.show();

        snackview = snackbar.getView();
        snackview.setVisibility(View.GONE);
    }

    public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.CategoriesHolder> {
        List<foodcategories> foodcategoriesList;
        Context FoodCategoriesContext;

        public FoodAdapter(List<foodcategories> foodcategoriesList, Context foodCategoriesContext) {
            this.foodcategoriesList = foodcategoriesList;
            FoodCategoriesContext = foodCategoriesContext;
        }

        @NonNull
        @Override
        public CategoriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(FoodCategoriesContext);
            View view = inflater.inflate(R.layout.food_category,null);
            return new CategoriesHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final CategoriesHolder holder, final int position) {
            final foodcategories product = foodcategoriesList.get(position);
            holder.CategoryText.setText(product.getCategoryName());

            holder.CategoryImage.setImageDrawable(FoodCategoriesContext.getResources().getDrawable(product.getCategoryImage()));
            holder.CateLL.setBackgroundResource(R.drawable.bgnormal);

            holder.CateLL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index=position;
                    notifyDataSetChanged();

                    if (holder.CategoryText.getText().toString()=="Dessert"){
                        FoodItemsAdapter adapter1 = new FoodItemsAdapter(DessertList,getApplicationContext());
                        FoodItemsRV.setAdapter(adapter1);
                    }
                    if (holder.CategoryText.getText().toString()=="Salads"){
                        FoodItemsAdapter adapter1 = new FoodItemsAdapter(SaladsList,getApplicationContext());
                        FoodItemsRV.setAdapter(adapter1);
                    }
                    if (holder.CategoryText.getText().toString()=="Meat"){
                        FoodItemsAdapter adapter1 = new FoodItemsAdapter(MeatList,getApplicationContext());
                        FoodItemsRV.setAdapter(adapter1);
                    }
                    if (holder.CategoryText.getText().toString()=="Drinks"){
                        FoodItemsAdapter adapter1 = new FoodItemsAdapter(DrinkList,getApplicationContext());
                        FoodItemsRV.setAdapter(adapter1);
                    }
                }
            });
            if(row_index==position){
                holder.CateLL.setBackgroundResource(R.drawable.cardonclickbg);
                holder.CategoryText.setTextColor(Color.parseColor("#ffffff"));
            }
            else
            {
                holder.CateLL.setBackgroundResource(R.drawable.cardnormalbg);
                holder.CategoryText.setTextColor(Color.parseColor("#000000"));
            }
        }

        @Override
        public int getItemCount() {
            return foodcategoriesList.size();
        }

        public class CategoriesHolder extends RecyclerView.ViewHolder {
            ImageView CategoryImage;
            TextView CategoryText;
            CardView CateLL;

            public CategoriesHolder(@NonNull View itemView) {
                super(itemView);
                CategoryImage = (ImageView)itemView.findViewById(R.id.category_logo);
                CategoryText = (TextView) itemView.findViewById(R.id.category_name);
                CateLL =  itemView.findViewById(R.id.food_categoryll);
            }
        }
    }
    public class FoodItemsAdapter extends RecyclerView.Adapter<FoodItemsAdapter.FoodItemsHolder> {
        List<FoodItems> foodItemsList;
        Context thiscontext;

        public FoodItemsAdapter(List<FoodItems> foodItemsList, Context thiscontext) {
            this.foodItemsList = foodItemsList;
            this.thiscontext = thiscontext;
        }

        @NonNull
        @Override
        public FoodItemsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(thiscontext);
            View view = inflater.inflate(R.layout.food_items,null);
            return new FoodItemsHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final FoodItemsHolder holder, int position) {

            final FoodItems product = foodItemsList.get(position);
            final String FoodItemName;
            FoodItemName = product.getItemName();
                    holder.ItemName.setText(product.getItemName());
            holder.ItemName.setTextColor(Color.parseColor("#000000"));
            holder.ItemPrice.setText("$"+product.getPrice());
            final int s = Integer.parseInt(product.getPrice().toString());
            holder.ItemPrice.setTextColor(Color.parseColor("#000000"));
            holder.FoodItemCard.setBackgroundResource(R.drawable.bgnormal);
            holder.PlusButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    quantity+=s;
                    String TotalPlus = Integer.toString(quantity);
                    //Toast.makeText(thiscontext,"Your Bill is $"+TotalPlus,Toast.LENGTH_SHORT).show();
                    snackbar.setText("Your Bill is $"+TotalPlus);
                    int cnt = product.getItemCount();
                    product.setItemCount(cnt+1);
                    int ans = cnt+1;
                    String anss = Integer.toString(ans);
                    holder.ItemCount.setText(anss);

                   /* snackbar.setAction("View Cart", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int j = FoodCart.size();
                            String ItemCount = Integer.toString(j);
                            snackbar.setText("You have "+ItemCount+" items in your cart ");
                            snackbar.show();
                        }
                    });
                    snackbar.show();
                    snackbar.setActionTextColor(Color.parseColor("#000000"));*/
                    FoodCart.add(FoodItemName);
                    snackview.setVisibility(View.VISIBLE);
                    snackview.setBackgroundResource(R.drawable.cardonclickbg);
                    snackbar.show();
                    ViewGroup.MarginLayoutParams cardViewMarginParams = (ViewGroup.MarginLayoutParams) Card2.getLayoutParams();
                    cardViewMarginParams.setMargins(0, 0, 0, 100);
                    Card2.requestLayout();
                }
            });
            holder.MinusButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    boolean checkfooditem = FoodCart.contains(FoodItemName);
                    if(checkfooditem&&product.getItemCount()>0) {
                        if (quantity >= 0) {
                            FoodCart.remove(FoodItemName);
                            quantity -= s;
                            int cnt = product.getItemCount();
                            product.setItemCount(cnt-1);
                            if(cnt>0){
                                int ans = cnt-1;
                                String anss = Integer.toString(ans);
                                holder.ItemCount.setText(anss);}
                            String TotalMinus = Integer.toString(quantity);
                            snackbar.setText("Your bill is $" + TotalMinus);
                            snackview.setVisibility(View.VISIBLE);
                            snackview.setBackgroundResource(R.drawable.cardonclickbg);
                            snackbar.show();
                            if (quantity == 0) {
                                snackbar.dismiss();
                                ViewGroup.MarginLayoutParams cardViewMarginParams = (ViewGroup.MarginLayoutParams) Card2.getLayoutParams();
                                cardViewMarginParams.setMargins(0, 0, 0, 0);
                                Card2.requestLayout();
                            }
                        } else {
                            quantity += s;
                        }
                    }
                }
            });

        }
        @Override
        public int getItemCount() {
            return foodItemsList.size();
        }

        public class FoodItemsHolder extends RecyclerView.ViewHolder {
            TextView ItemName,ItemPrice,ItemCount;
            CardView FoodItemCard;
            Button PlusButton,MinusButton;
            CoordinatorLayout FoodItemsCordinator;
            public FoodItemsHolder(@NonNull View itemView) {
                super(itemView);
                ItemName = itemView.findViewById(R.id.item_name);
                ItemPrice = itemView.findViewById(R.id.item_price);
                FoodItemCard = itemView.findViewById(R.id.fooditemscv);
                PlusButton = itemView.findViewById(R.id.plusbtn);
                MinusButton = itemView.findViewById(R.id.minusbtn);
                FoodItemsCordinator = itemView.findViewById(R.id.co_ordinator_main);
                ItemCount = itemView.findViewById(R.id.fooditemcount);
            }
        }
    }
}
