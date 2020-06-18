package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\bHÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile;", "", "fileId", "", "path", "fileLength", "", "storageType", "Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile$StorageType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile$StorageType;)V", "getFileId", "()Ljava/lang/String;", "getFileLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPath", "getStorageType", "()Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile$StorageType;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile$StorageType;)Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile;", "equals", "", "other", "hashCode", "", "toString", "StorageType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TemporaryFile.kt */
public final class TemporaryFile {

    /* renamed from: a  reason: collision with root package name */
    public final String f5207a;
    public final String b;
    public final Long c;

    /* renamed from: d  reason: collision with root package name */
    public final StorageType f5208d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile$StorageType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FILE_SERVICE", "LOCAL", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: TemporaryFile.kt */
    public enum StorageType {
        FILE_SERVICE("FileService"),
        LOCAL("Local");
        
        public final String c;

        /* access modifiers changed from: public */
        StorageType(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    public TemporaryFile(String str, String str2, Long l2, StorageType storageType) {
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        Intrinsics.checkParameterIsNotNull(storageType, "storageType");
        this.f5207a = str;
        this.b = str2;
        this.c = l2;
        this.f5208d = storageType;
    }

    public static /* synthetic */ TemporaryFile copy$default(TemporaryFile temporaryFile, String str, String str2, Long l2, StorageType storageType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = temporaryFile.f5207a;
        }
        if ((i2 & 2) != 0) {
            str2 = temporaryFile.b;
        }
        if ((i2 & 4) != 0) {
            l2 = temporaryFile.c;
        }
        if ((i2 & 8) != 0) {
            storageType = temporaryFile.f5208d;
        }
        return temporaryFile.a(str, str2, l2, storageType);
    }

    public final TemporaryFile a(String str, String str2, Long l2, StorageType storageType) {
        Intrinsics.checkParameterIsNotNull(str, "fileId");
        Intrinsics.checkParameterIsNotNull(storageType, "storageType");
        return new TemporaryFile(str, str2, l2, storageType);
    }

    public final String a() {
        return this.f5207a;
    }

    public final String b() {
        return this.b;
    }

    public final StorageType c() {
        return this.f5208d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemporaryFile)) {
            return false;
        }
        TemporaryFile temporaryFile = (TemporaryFile) obj;
        return Intrinsics.areEqual((Object) this.f5207a, (Object) temporaryFile.f5207a) && Intrinsics.areEqual((Object) this.b, (Object) temporaryFile.b) && Intrinsics.areEqual((Object) this.c, (Object) temporaryFile.c) && Intrinsics.areEqual((Object) this.f5208d, (Object) temporaryFile.f5208d);
    }

    public int hashCode() {
        String str = this.f5207a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        StorageType storageType = this.f5208d;
        if (storageType != null) {
            i2 = storageType.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("TemporaryFile(fileId=");
        a2.append(this.f5207a);
        a2.append(", path=");
        a2.append(this.b);
        a2.append(", fileLength=");
        a2.append(this.c);
        a2.append(", storageType=");
        a2.append(this.f5208d);
        a2.append(")");
        return a2.toString();
    }
}
