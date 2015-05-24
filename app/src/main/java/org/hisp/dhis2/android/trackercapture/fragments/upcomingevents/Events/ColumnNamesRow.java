package org.hisp.dhis2.android.trackercapture.fragments.upcomingevents.Events;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.hisp.dhis2.android.trackercapture.R;


public class ColumnNamesRow implements EventRow
{
    private String mFirstItem;
    private String mSecondItem;
    private String mThirdItem;

    @Override
    public View getView(LayoutInflater inflater, View convertView, ViewGroup container) {
        View view;
        ViewHolder holder;

        if (convertView == null) {
            view = inflater.inflate(R.layout.listview_column_names_item, container, false);
            holder = new ViewHolder(
                    (TextView) view.findViewById(R.id.first_column_name),
                    (TextView) view.findViewById(R.id.second_column_name),
                    (TextView) view.findViewById(R.id.third_column_name)
            );
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }

        holder.firstItem.setText(mFirstItem);
        holder.secondItem.setText(mSecondItem);
        holder.thirdItem.setText(mThirdItem);

        return view;
    }

    @Override
    public int getViewType() {
        return EventRowType.COLUMN_NAMES_ROW.ordinal();
    }

    @Override
    public long getId() {
        return -1;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setThirdItem(String thirdItem) {
        this.mThirdItem = thirdItem;
    }

    public void setSecondItem(String secondItem) {
        this.mSecondItem = secondItem;
    }

    public void setFirstItem(String firstItem) {
        this.mFirstItem = firstItem;
    }

    private static class ViewHolder {
        public final TextView firstItem;
        public final TextView secondItem;
        public final TextView thirdItem;

        private ViewHolder(TextView firstItem,
                           TextView secondItem,
                           TextView thirdItem) {
            this.firstItem = firstItem;
            this.secondItem = secondItem;
            this.thirdItem = thirdItem;
        }
    }


}
