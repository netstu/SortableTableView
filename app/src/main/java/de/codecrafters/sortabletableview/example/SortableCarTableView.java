package de.codecrafters.sortabletableview.example;

import android.content.Context;
import android.util.AttributeSet;

import de.codecrafters.tableview.SortableTableView;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;


/**
 * Created by Ingo on 18.07.2015.
 */
public class SortableCarTableView extends SortableTableView<Car> {

    public SortableCarTableView(Context context) {
        this(context, null);
    }

    public SortableCarTableView(Context context, AttributeSet attributes) {
        this(context, attributes, 0);
    }

    public SortableCarTableView(Context context, AttributeSet attributes, int styleAttributes) {
        super(context, attributes, styleAttributes);

        SimpleTableHeaderAdapter simpleTableHeaderAdapter = new SimpleTableHeaderAdapter(context, "Hersteller", "Bezeichung", "Leistung", "Preis");
        simpleTableHeaderAdapter.setTextColor(0xCCFFFFFF);
        simpleTableHeaderAdapter.setPaddingTop(40);
        simpleTableHeaderAdapter.setPaddingBottom(40);
        setHeaderAdapter(simpleTableHeaderAdapter);

        setColumnWeight(0, 2);
        setColumnWeight(1, 4);
        setColumnWeight(2, 3);
        setColumnWeight(3, 2);
    }
}