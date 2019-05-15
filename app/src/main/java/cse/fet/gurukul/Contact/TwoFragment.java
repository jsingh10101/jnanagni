package cse.fet.gurukul.Contact;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cse.fet.gurukul.R;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class TwoFragment extends Fragment {
    private RecyclerView ContactList;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.pubg);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);
        //  ImageView circularImageView = view.findViewById(R.id.circleView);
        //   circularImageView.setImageBitmap(circularBitmap);


        ContactList = view.findViewById(R.id.ContactDetail2);
        ContactList.setHasFixedSize(true);
        ContactList.setLayoutManager(new LinearLayoutManager(getContext()));
        ContactList.setAdapter(new ContactAdapter(getContext(), Contactcollection2.getContact()));
        return view;
    }

}