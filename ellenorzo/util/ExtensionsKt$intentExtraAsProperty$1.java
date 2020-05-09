package p289hu.ekreta.ellenorzo.util;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J$\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0002\u0010\u0007J,\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo17463d2 = {"hu/ekreta/ellenorzo/util/ExtensionsKt$intentExtraAsProperty$1", "Lkotlin/properties/ReadWriteProperty;", "Landroid/content/Intent;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$intentExtraAsProperty$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$intentExtraAsProperty$1 implements ReadWriteProperty<Intent, T> {

    /* renamed from: c */
    public final /* synthetic */ Object f15343c;

    /* renamed from: e */
    public final /* synthetic */ Function3 f15344e;

    public ExtensionsKt$intentExtraAsProperty$1(Object obj, Function3 function3) {
        this.f15343c = obj;
        this.f15344e = function3;
    }

    /* renamed from: a */
    public T getValue(Intent intent, KProperty<?> kProperty) {
        Bundle b = C0082a.m121b(intent, "thisRef", (KProperty) kProperty, "property");
        T t = b != null ? b.get(kProperty.getName()) : null;
        Intrinsics.reifiedOperationMarker(2, "T");
        return t != null ? t : this.f15343c;
    }

    /* renamed from: a */
    public void setValue(Intent intent, KProperty<?> kProperty, T t) {
        String a = C0082a.m94a(intent, "thisRef", (KProperty) kProperty, "property");
        if (t == null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.remove(a);
                return;
            }
            return;
        }
        this.f15344e.invoke(intent, a, t);
    }
}
