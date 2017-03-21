package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.EventFragment.OnListFragmentInteractionListener;
import lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.Event.EventContent.EventItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link EventItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyeventRecyclerViewAdapter extends RecyclerView.Adapter<MyeventRecyclerViewAdapter.ViewHolder> {

    private final List<EventItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyeventRecyclerViewAdapter(List<EventItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNameView.setText(mValues.get(position).name);
        holder.mContentView.setText(mValues.get(position).details);
        holder.mScore.setText(String.valueOf(mValues.get(position).score));
        holder.mPicture.setImageResource(R.drawable.octocat);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mContentView;
        public final ImageView mPicture;
        public final TextView mScore;
        public EventItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mNameView = (TextView) view.findViewById(R.id.event_name);
            mContentView = (TextView) view.findViewById(R.id.event_detail);
            mScore = (TextView) view.findViewById(R.id.event_score);
            mPicture = (ImageView) view.findViewById(R.id.event_photo);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
