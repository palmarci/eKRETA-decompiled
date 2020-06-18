package hu.ekreta.ellenorzo.util;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J'\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000b"}, d2 = {"hu/ekreta/ellenorzo/util/ExtensionsKt$stringPref$1", "Lkotlin/properties/ReadWriteProperty;", "", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$stringPref$1 implements ReadWriteProperty<Object, String> {
    public final /* synthetic */ SharedPreferences c;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public ExtensionsKt$stringPref$1(SharedPreferences sharedPreferences, String str, String str2) {
        this.c = sharedPreferences;
        this.e = str;
        this.f = str2;
    }

    /* renamed from: a */
    public void setValue(Object obj, KProperty<?> kProperty, String str) {
        Intrinsics.checkParameterIsNotNull(obj, "thisRef");
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        this.c.edit().putString(this.e, str).commit();
    }

    public String getValue(Object obj, KProperty<?> kProperty) {
        Intrinsics.checkParameterIsNotNull(obj, "thisRef");
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        return this.c.getString(this.e, this.f);
    }
}
