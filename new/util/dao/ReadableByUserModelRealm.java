package hu.ekreta.ellenorzo.util.dao;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "readByUser", "", "getReadByUser", "()Ljava/lang/Boolean;", "setReadByUser", "(Ljava/lang/Boolean;)V", "uid", "", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReadableByUserModelRealm.kt */
public interface ReadableByUserModelRealm extends ProfileSpecificModelRealm {
    void b(Boolean bool);

    String d();

    Boolean u();
}
