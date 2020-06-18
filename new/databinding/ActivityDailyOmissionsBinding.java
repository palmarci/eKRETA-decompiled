package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

public abstract class ActivityDailyOmissionsBinding extends ViewDataBinding {
    public ActivityDailyOmissionsBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, RecyclerView recyclerView, Toolbar toolbar) {
        super(obj, view, i2);
    }

    public abstract void a(DataBindingListViewModel dataBindingListViewModel);
}
