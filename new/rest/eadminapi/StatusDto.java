package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001%B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R6\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/StatusDto;", "", "buildNumber", "", "enabledFeatures", "", "idpUrl", "trackingId", "fileHandlers", "Ljava/util/HashMap;", "Lhu/ekreta/ellenorzo/rest/eadminapi/StatusDto$FileHandler;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "getBuildNumber", "()Ljava/lang/String;", "getEnabledFeatures", "()Ljava/util/List;", "getFileHandlers", "()Ljava/util/HashMap;", "fileServiceApiUrl", "getFileServiceApiUrl", "fileServiceFeatures", "getFileServiceFeatures", "getIdpUrl", "getTrackingId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "FileHandler", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: StatusDto.kt */
public final class StatusDto {
    @c("buildNumber")
    public final String buildNumber;
    @c("enabledFeatures")
    public final List<String> enabledFeatures;
    @c("fileHandlers")
    public final HashMap<String, FileHandler> fileHandlers;
    @c("idpUrl")
    public final String idpUrl;
    @c("trackingId")
    public final String trackingId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/StatusDto$FileHandler;", "", "apiUrl", "", "features", "", "(Ljava/lang/String;Ljava/util/List;)V", "getApiUrl", "()Ljava/lang/String;", "getFeatures", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: StatusDto.kt */
    public static final class FileHandler {
        @c("apiUrl")
        public final String apiUrl;
        @c("features")
        public final List<String> features;

        public FileHandler(String str, List<String> list) {
            this.apiUrl = str;
            this.features = list;
        }

        public static /* synthetic */ FileHandler copy$default(FileHandler fileHandler, String str, List<String> list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = fileHandler.apiUrl;
            }
            if ((i2 & 2) != 0) {
                list = fileHandler.features;
            }
            return fileHandler.copy(str, list);
        }

        public final String component1() {
            return this.apiUrl;
        }

        public final List<String> component2() {
            return this.features;
        }

        public final FileHandler copy(String str, List<String> list) {
            return new FileHandler(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileHandler)) {
                return false;
            }
            FileHandler fileHandler = (FileHandler) obj;
            return Intrinsics.areEqual((Object) this.apiUrl, (Object) fileHandler.apiUrl) && Intrinsics.areEqual((Object) this.features, (Object) fileHandler.features);
        }

        public final String getApiUrl() {
            return this.apiUrl;
        }

        public final List<String> getFeatures() {
            return this.features;
        }

        public int hashCode() {
            String str = this.apiUrl;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.features;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("FileHandler(apiUrl=");
            a2.append(this.apiUrl);
            a2.append(", features=");
            return a.a(a2, (List) this.features, ")");
        }
    }

    public StatusDto(String str, List<String> list, String str2, String str3, HashMap<String, FileHandler> hashMap) {
        this.buildNumber = str;
        this.enabledFeatures = list;
        this.idpUrl = str2;
        this.trackingId = str3;
        this.fileHandlers = hashMap;
    }

    public static /* synthetic */ StatusDto copy$default(StatusDto statusDto, String str, List<String> list, String str2, String str3, HashMap<String, FileHandler> hashMap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = statusDto.buildNumber;
        }
        if ((i2 & 2) != 0) {
            list = statusDto.enabledFeatures;
        }
        List<String> list2 = list;
        if ((i2 & 4) != 0) {
            str2 = statusDto.idpUrl;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = statusDto.trackingId;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            hashMap = statusDto.fileHandlers;
        }
        return statusDto.copy(str, list2, str4, str5, hashMap);
    }

    public final String component1() {
        return this.buildNumber;
    }

    public final List<String> component2() {
        return this.enabledFeatures;
    }

    public final String component3() {
        return this.idpUrl;
    }

    public final String component4() {
        return this.trackingId;
    }

    public final HashMap<String, FileHandler> component5() {
        return this.fileHandlers;
    }

    public final StatusDto copy(String str, List<String> list, String str2, String str3, HashMap<String, FileHandler> hashMap) {
        return new StatusDto(str, list, str2, str3, hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusDto)) {
            return false;
        }
        StatusDto statusDto = (StatusDto) obj;
        return Intrinsics.areEqual((Object) this.buildNumber, (Object) statusDto.buildNumber) && Intrinsics.areEqual((Object) this.enabledFeatures, (Object) statusDto.enabledFeatures) && Intrinsics.areEqual((Object) this.idpUrl, (Object) statusDto.idpUrl) && Intrinsics.areEqual((Object) this.trackingId, (Object) statusDto.trackingId) && Intrinsics.areEqual((Object) this.fileHandlers, (Object) statusDto.fileHandlers);
    }

    public final String getBuildNumber() {
        return this.buildNumber;
    }

    public final List<String> getEnabledFeatures() {
        return this.enabledFeatures;
    }

    public final HashMap<String, FileHandler> getFileHandlers() {
        return this.fileHandlers;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.get("FileService")).getApiUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFileServiceApiUrl() {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, hu.ekreta.ellenorzo.rest.eadminapi.StatusDto$FileHandler> r0 = r2.fileHandlers
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "FileService"
            java.lang.Object r0 = r0.get(r1)
            hu.ekreta.ellenorzo.rest.eadminapi.StatusDto$FileHandler r0 = (hu.ekreta.ellenorzo.rest.eadminapi.StatusDto.FileHandler) r0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.getApiUrl()
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            java.lang.String r0 = ""
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.rest.eadminapi.StatusDto.getFileServiceApiUrl():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.get("FileService")).getFeatures();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> getFileServiceFeatures() {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, hu.ekreta.ellenorzo.rest.eadminapi.StatusDto$FileHandler> r0 = r2.fileHandlers
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "FileService"
            java.lang.Object r0 = r0.get(r1)
            hu.ekreta.ellenorzo.rest.eadminapi.StatusDto$FileHandler r0 = (hu.ekreta.ellenorzo.rest.eadminapi.StatusDto.FileHandler) r0
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = r0.getFeatures()
            if (r0 == 0) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.rest.eadminapi.StatusDto.getFileServiceFeatures():java.util.List");
    }

    public final String getIdpUrl() {
        return this.idpUrl;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public int hashCode() {
        String str = this.buildNumber;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.enabledFeatures;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.idpUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.trackingId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        HashMap<String, FileHandler> hashMap = this.fileHandlers;
        if (hashMap != null) {
            i2 = hashMap.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("StatusDto(buildNumber=");
        a2.append(this.buildNumber);
        a2.append(", enabledFeatures=");
        a2.append(this.enabledFeatures);
        a2.append(", idpUrl=");
        a2.append(this.idpUrl);
        a2.append(", trackingId=");
        a2.append(this.trackingId);
        a2.append(", fileHandlers=");
        a2.append(this.fileHandlers);
        a2.append(")");
        return a2.toString();
    }
}
