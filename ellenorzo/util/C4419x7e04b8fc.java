package p289hu.ekreta.ellenorzo.util;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J$\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0002\u0010\u0007J,\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f¸\u0006\u0000"}, mo17463d2 = {"hu/ekreta/ellenorzo/util/ExtensionsKt$intentExtraAsProperty$1", "Lkotlin/properties/ReadWriteProperty;", "Landroid/content/Intent;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$parcelableListIntentExtraAsProperty$$inlined$intentExtraAsProperty$1 */
/* compiled from: Extensions.kt */
public final class C4419x7e04b8fc implements ReadWriteProperty<Intent, List<? extends T>> {

    /* renamed from: c */
    public final /* synthetic */ Object f15325c;

    public C4419x7e04b8fc(Object obj) {
        this.f15325c = obj;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List<? extends T>, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v5, types: [java.util.List<? extends T>, java.lang.Object]
      assigns: [java.lang.Object]
      uses: [java.util.List<? extends T>]
      mth insns count: 15
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<? extends T> getValue(android.content.Intent r3, kotlin.reflect.KProperty<?> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "thisRef"
            java.lang.String r1 = "property"
            android.os.Bundle r3 = p000a.p020b.p021a.p022a.C0082a.m121b(r3, r0, r4, r1)
            r0 = 0
            if (r3 == 0) goto L_0x0014
            java.lang.String r4 = r4.getName()
            java.lang.Object r3 = r3.get(r4)
            goto L_0x0015
        L_0x0014:
            r3 = r0
        L_0x0015:
            boolean r4 = r3 instanceof java.util.List
            if (r4 != 0) goto L_0x001a
            r3 = r0
        L_0x001a:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            java.lang.Object r3 = r2.f15325c
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.C4419x7e04b8fc.getValue(android.content.Intent, kotlin.reflect.KProperty):java.lang.Object");
    }

    /* renamed from: a */
    public void setValue(Intent intent, KProperty<?> kProperty, List<? extends T> list) {
        String a = C0082a.m94a(intent, "thisRef", (KProperty) kProperty, "property");
        if (list == null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.remove(a);
                return;
            }
            return;
        }
        List list2 = list;
        ArrayList arrayList = (ArrayList) (!(list2 instanceof ArrayList) ? null : list2);
        if (arrayList == null) {
            arrayList = new ArrayList(list2);
        }
        intent.putParcelableArrayListExtra(a, arrayList);
    }
}
