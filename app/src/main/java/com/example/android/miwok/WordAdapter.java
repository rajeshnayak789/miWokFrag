package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    private int mColorResourceid;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId/*,int audioResourceId*/)
    {
        super(context, 0, words);
        mColorResourceid = colorResourceId;
        /*mAudioResourceid=audioResourceId;*/
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_language);
        defaultTextView.setText(currentWord.getDefaultLanguage());

        TextView miWokTextView = (TextView) listItemView.findViewById(R.id.miWok_language);
        miWokTextView.setText(currentWord.getMiWokLanguage());

        ImageView miWokImageView = (ImageView) listItemView.findViewById(R.id.miWokImage);

        if (currentWord.hasImage())
        {
            miWokImageView.setImageResource(currentWord.getImageResourceid());
        } else
        {
            miWokImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceid);

        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
