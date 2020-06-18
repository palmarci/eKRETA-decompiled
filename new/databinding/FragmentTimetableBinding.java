package hu.ekreta.ellenorzo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import h.l.g;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.timetable.TimeTableViewModel;

public abstract class FragmentTimetableBinding extends ViewDataBinding {
    public final SwipeRefreshLayout A;
    public final RecyclerView B;
    public TimeTableViewModel C;
    public final TextView z;

    public FragmentTimetableBinding(Object obj, View view, int i2, View view2, TextView textView, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, MaterialCalendarView materialCalendarView) {
        super(obj, view, i2);
        this.z = textView;
        this.A = swipeRefreshLayout;
        this.B = recyclerView;
    }

    public static FragmentTimetableBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        return (FragmentTimetableBinding) ViewDataBinding.a(layoutInflater, (int) R.layout.fragment_timetable, viewGroup, z2, (Object) g.b);
    }

    public abstract void a(TimeTableViewModel timeTableViewModel);
}
