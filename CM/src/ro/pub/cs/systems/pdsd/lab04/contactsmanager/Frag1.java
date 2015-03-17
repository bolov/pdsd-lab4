package ro.pub.cs.systems.pdsd.lab04.contactsmanager;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Frag1 extends Fragment {
	
	class MyListner implements android.view.View.OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			FragmentManager fm = getActivity().getFragmentManager();
			FragmentTransaction ft = fm.beginTransaction();
			
			Frag2 f2 = (Frag2) fm.findFragmentById(R.id.f2);
			
			if (f2 == null) {
				ft.add(R.id.f2, new Frag2());
			} else {
				ft.remove(f2);
			}
			ft.commit();
			
			
		}
		
	}

	
	@Override
	public View onCreateView(LayoutInflater i1, ViewGroup vg, Bundle bdl) {
		View v =  i1.inflate(R.layout.f1, vg, false);
		

        
        return v;
	}
	
	@Override
	public void onActivityCreated(Bundle state) {
		super.onActivityCreated(state);
		Button toogle_btn = (Button) getActivity().findViewById(R.id.button_toggle);
        toogle_btn.setOnClickListener(new MyListner());
        
        /*
        Button saveb = (Button) getActivity().findViewById(R.id.button_save);
        saveb.setOnClickListener(new MyListner());
        
        Button cancelb= (Button) getActivity().findViewById(R.id.button_cancel);
		
        cancelb.setOnClickListener(new MyListner());
        */
	}

}
