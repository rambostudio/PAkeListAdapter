package rambostudio.com.listadapter;

import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class UserAdapter extends ListAdapter<Post, PostViewHolder> {
    public UserAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,
                parent,
                false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
//        holder.bindData(getItem(position), onItemClickListener);
    }

    private static final DiffUtil.ItemCallback<Post> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<Post>() {
                @Override
                public boolean areItemsTheSame(
                        @NonNull Post oldUser, @NonNull Post newUser) {
                    // User properties may have changed if reloaded from the DB, but ID is fixed
                    return oldUser.getId().equals(newUser.getId());
                }

                @Override
                public boolean areContentsTheSame(
                        @NonNull Post oldUser, @NonNull Post newUser) {
                    // NOTE: if you use equals, your object must properly override Object#equals()
                    // Incorrectly returning false here will result in too many animations.
                    return oldUser.equals(newUser);
                }
            };
}
