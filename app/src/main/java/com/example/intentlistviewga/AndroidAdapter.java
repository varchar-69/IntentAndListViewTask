package com.example.intentlistviewga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class AndroidAdapter extends ArrayAdapter<AndroidVersion> {

    private final Context context;
    private final List<AndroidVersion> versions;

    public AndroidAdapter(Context context, List<AndroidVersion> versions) {
        super(context, 0, versions);
        this.context = context;
        this.versions = versions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.icon = convertView.findViewById(R.id.imgIcon);
            holder.name = convertView.findViewById(R.id.tvName);
            holder.shortDesc = convertView.findViewById(R.id.tvShortDesc);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        AndroidVersion v = versions.get(position);
        holder.icon.setImageResource(v.imageRes);
        holder.name.setText(v.name);
        holder.shortDesc.setText(v.description);

        return convertView;
    }

    static class ViewHolder {
        ImageView icon;
        TextView name;
        TextView shortDesc;
    }
}