package hu.ekreta.ellenorzo.util;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"hu/ekreta/ellenorzo/util/ExtensionsKt$sortByProperty$1", "Ljava/util/Comparator;", "compare", "", "obj0", "obj1", "(Ljava/lang/Object;Ljava/lang/Object;)I", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$sortByProperty$1 implements Comparator<E> {
    public final /* synthetic */ Locale c;
    public final /* synthetic */ KProperty1 e;

    public ExtensionsKt$sortByProperty$1(Locale locale, KProperty1 kProperty1) {
        this.c = locale;
        this.e = kProperty1;
    }

    public int compare(E e2, E e3) {
        Collator instance = Collator.getInstance(this.c);
        if (e2 != null && e3 != null) {
            return instance.compare((String) this.e.get(e2), (String) this.e.get(e3));
        }
        throw new RuntimeException("sortable item is null");
    }
}
