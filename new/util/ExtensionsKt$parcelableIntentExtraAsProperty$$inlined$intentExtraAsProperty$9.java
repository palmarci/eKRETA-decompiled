package hu.ekreta.ellenorzo.util;

import a.b.a.a.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J$\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0002\u0010\u0007J,\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"hu/ekreta/ellenorzo/util/ExtensionsKt$intentExtraAsProperty$1", "Lkotlin/properties/ReadWriteProperty;", "Landroid/content/Intent;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$parcelableIntentExtraAsProperty$$inlined$intentExtraAsProperty$9 implements ReadWriteProperty<Intent, T> {
    public final /* synthetic */ Object c;

    /* renamed from: a */
    public T getValue(Intent intent, KProperty<?> kProperty) {
        Bundle b = a.b(intent, "thisRef", (KProperty) kProperty, "property");
        T t = b != null ? b.get(kProperty.getName()) : null;
        Intrinsics.reifiedOperationMarker(2, "T");
        return t != null ? t : this.c;
    }

    /* renamed from: a */
    public void setValue(Intent intent, KProperty<?> kProperty, T t) {
        String a2 = a.a(intent, "thisRef", (KProperty) kProperty, "property");
        if (t == null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.remove(a2);
                return;
            }
            return;
        }
        intent.putExtra(a2, (Parcelable) t);
    }
}
