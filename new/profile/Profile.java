package hu.ekreta.ellenorzo.profile;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\bG\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0002\u0010 J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0017HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\nHÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u000eHÆ\u0003J\u0002\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001J\t\u0010`\u001a\u00020\nHÖ\u0001J\u0013\u0010a\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010cHÖ\u0003J\t\u0010d\u001a\u00020\nHÖ\u0001J\t\u0010e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0017\u0010/\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b0\u00101\u001a\u0004\b2\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b>\u0010-R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\"R\u0011\u0010B\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bC\u0010\"R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\"R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\"¨\u0006k"}, d2 = {"Lhu/ekreta/ellenorzo/profile/Profile;", "Landroid/os/Parcelable;", "userName", "", "fullName", "active", "", "accessToken", "tokenType", "expiresIn", "", "refreshToken", "studentName", "role", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "instituteName", "instituteCode", "instituteUserId", "instituteUrl", "studentId", "schoolYearId", "birthName", "birthDate", "Ljava/util/Calendar;", "placeOfBirth", "mothersName", "address", "", "creationTime", "subNumber", "password", "eAdministrationIsActive", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/authentication/SupportedRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccessToken", "()Ljava/lang/String;", "getActive", "()Z", "getAddress", "()Ljava/util/List;", "getBirthDate", "()Ljava/util/Calendar;", "getBirthName", "getCreationTime", "getEAdministrationIsActive", "getExpiresIn", "()I", "getFullName", "id", "id$annotations", "()V", "getId", "getInstituteCode", "getInstituteName", "getInstituteUrl", "getInstituteUserId", "getMothersName", "getPassword", "getPlaceOfBirth", "getRefreshToken", "getRole", "()Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "roleNameRes", "getRoleNameRes", "getSchoolYearId", "getStudentId", "getStudentName", "studentShortName", "getStudentShortName", "getSubNumber", "getTokenType", "getUserName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Profile.kt */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String A;
    public final boolean B;
    public final String c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6001g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6002h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6003i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6004j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6005k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6006l;

    /* renamed from: m  reason: collision with root package name */
    public final SupportedRole f6007m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6008n;

    /* renamed from: o  reason: collision with root package name */
    public final String f6009o;

    /* renamed from: p  reason: collision with root package name */
    public final String f6010p;

    /* renamed from: q  reason: collision with root package name */
    public final String f6011q;
    public final String r;
    public final String s;
    public final String t;
    public final Calendar u;
    public final String v;
    public final String w;
    public final List<String> x;
    public final Calendar y;
    public final String z;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Profile(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (SupportedRole) Enum.valueOf(SupportedRole.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Calendar) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (Calendar) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i2) {
            return new Profile[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6012a = new int[SupportedRole.values().length];

        static {
            f6012a[SupportedRole.Student.ordinal()] = 1;
            f6012a[SupportedRole.Guardian.ordinal()] = 2;
        }
    }

    public Profile(String str, String str2, boolean z2, String str3, String str4, int i2, String str5, String str6, SupportedRole supportedRole, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Calendar calendar, String str14, String str15, List<String> list, Calendar calendar2, String str16, String str17, boolean z3) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        SupportedRole supportedRole2 = supportedRole;
        String str24 = str7;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        String str28 = str11;
        String str29 = str12;
        String str30 = str13;
        String str31 = str14;
        Intrinsics.checkParameterIsNotNull(str18, "userName");
        Intrinsics.checkParameterIsNotNull(str19, "fullName");
        Intrinsics.checkParameterIsNotNull(str20, "accessToken");
        Intrinsics.checkParameterIsNotNull(str21, "tokenType");
        Intrinsics.checkParameterIsNotNull(str22, "refreshToken");
        Intrinsics.checkParameterIsNotNull(str23, "studentName");
        Intrinsics.checkParameterIsNotNull(supportedRole2, "role");
        Intrinsics.checkParameterIsNotNull(str24, "instituteName");
        Intrinsics.checkParameterIsNotNull(str25, "instituteCode");
        Intrinsics.checkParameterIsNotNull(str26, "instituteUserId");
        Intrinsics.checkParameterIsNotNull(str27, "instituteUrl");
        Intrinsics.checkParameterIsNotNull(str28, "studentId");
        Intrinsics.checkParameterIsNotNull(str29, "schoolYearId");
        Intrinsics.checkParameterIsNotNull(str30, "birthName");
        Intrinsics.checkParameterIsNotNull(calendar, "birthDate");
        Intrinsics.checkParameterIsNotNull(str14, "placeOfBirth");
        Intrinsics.checkParameterIsNotNull(str15, "mothersName");
        Intrinsics.checkParameterIsNotNull(list, "address");
        Intrinsics.checkParameterIsNotNull(calendar2, "creationTime");
        Intrinsics.checkParameterIsNotNull(str16, "subNumber");
        this.e = str18;
        this.f = str19;
        this.f6001g = z2;
        this.f6002h = str20;
        this.f6003i = str21;
        this.f6004j = i2;
        this.f6005k = str22;
        this.f6006l = str23;
        this.f6007m = supportedRole2;
        this.f6008n = str24;
        this.f6009o = str25;
        this.f6010p = str26;
        this.f6011q = str27;
        this.r = str28;
        this.s = str29;
        this.t = str30;
        this.u = calendar;
        this.v = str14;
        this.w = str15;
        this.x = list;
        this.y = calendar2;
        this.z = str16;
        this.A = str17;
        this.B = z3;
        this.c = this.f6009o + '#' + this.f6010p + '#' + this.f6007m;
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, boolean z2, String str3, String str4, int i2, String str5, String str6, SupportedRole supportedRole, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Calendar calendar, String str14, String str15, List list, Calendar calendar2, String str16, String str17, boolean z3, int i3, Object obj) {
        Profile profile2 = profile;
        int i4 = i3;
        return profile.a((i4 & 1) != 0 ? profile2.e : str, (i4 & 2) != 0 ? profile2.f : str2, (i4 & 4) != 0 ? profile2.f6001g : z2, (i4 & 8) != 0 ? profile2.f6002h : str3, (i4 & 16) != 0 ? profile2.f6003i : str4, (i4 & 32) != 0 ? profile2.f6004j : i2, (i4 & 64) != 0 ? profile2.f6005k : str5, (i4 & 128) != 0 ? profile2.f6006l : str6, (i4 & 256) != 0 ? profile2.f6007m : supportedRole, (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? profile2.f6008n : str7, (i4 & 1024) != 0 ? profile2.f6009o : str8, (i4 & 2048) != 0 ? profile2.f6010p : str9, (i4 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? profile2.f6011q : str10, (i4 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? profile2.r : str11, (i4 & 16384) != 0 ? profile2.s : str12, (i4 & 32768) != 0 ? profile2.t : str13, (i4 & 65536) != 0 ? profile2.u : calendar, (i4 & 131072) != 0 ? profile2.v : str14, (i4 & 262144) != 0 ? profile2.w : str15, (i4 & 524288) != 0 ? profile2.x : list, (i4 & 1048576) != 0 ? profile2.y : calendar2, (i4 & 2097152) != 0 ? profile2.z : str16, (i4 & 4194304) != 0 ? profile2.A : str17, (i4 & 8388608) != 0 ? profile2.B : z3);
    }

    public static /* synthetic */ void id$annotations() {
    }

    public final String A() {
        String str = "";
        for (String first : StringsKt__StringsKt.split$default((CharSequence) this.f6006l, new char[]{' '}, false, 0, 6, (Object) null)) {
            StringBuilder a2 = a.a(str);
            a2.append(Character.toUpperCase(StringsKt___StringsKt.first(first)));
            str = a2.toString();
        }
        return str;
    }

    public final String B() {
        return this.z;
    }

    public final String C() {
        return this.f6003i;
    }

    public final String D() {
        return this.e;
    }

    public final Profile a(String str, String str2, boolean z2, String str3, String str4, int i2, String str5, String str6, SupportedRole supportedRole, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Calendar calendar, String str14, String str15, List<String> list, Calendar calendar2, String str16, String str17, boolean z3) {
        String str18 = str;
        Intrinsics.checkParameterIsNotNull(str18, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "fullName");
        Intrinsics.checkParameterIsNotNull(str3, "accessToken");
        Intrinsics.checkParameterIsNotNull(str4, "tokenType");
        Intrinsics.checkParameterIsNotNull(str5, "refreshToken");
        Intrinsics.checkParameterIsNotNull(str6, "studentName");
        Intrinsics.checkParameterIsNotNull(supportedRole, "role");
        Intrinsics.checkParameterIsNotNull(str7, "instituteName");
        Intrinsics.checkParameterIsNotNull(str8, "instituteCode");
        Intrinsics.checkParameterIsNotNull(str9, "instituteUserId");
        Intrinsics.checkParameterIsNotNull(str10, "instituteUrl");
        Intrinsics.checkParameterIsNotNull(str11, "studentId");
        Intrinsics.checkParameterIsNotNull(str12, "schoolYearId");
        Intrinsics.checkParameterIsNotNull(str13, "birthName");
        Intrinsics.checkParameterIsNotNull(calendar, "birthDate");
        Intrinsics.checkParameterIsNotNull(str14, "placeOfBirth");
        Intrinsics.checkParameterIsNotNull(str15, "mothersName");
        Intrinsics.checkParameterIsNotNull(list, "address");
        Intrinsics.checkParameterIsNotNull(calendar2, "creationTime");
        Intrinsics.checkParameterIsNotNull(str16, "subNumber");
        return new Profile(str18, str2, z2, str3, str4, i2, str5, str6, supportedRole, str7, str8, str9, str10, str11, str12, str13, calendar, str14, str15, list, calendar2, str16, str17, z3);
    }

    public final String d() {
        return this.f6002h;
    }

    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f6001g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Profile) {
                Profile profile = (Profile) obj;
                if (Intrinsics.areEqual((Object) this.e, (Object) profile.e) && Intrinsics.areEqual((Object) this.f, (Object) profile.f)) {
                    if ((this.f6001g == profile.f6001g) && Intrinsics.areEqual((Object) this.f6002h, (Object) profile.f6002h) && Intrinsics.areEqual((Object) this.f6003i, (Object) profile.f6003i)) {
                        if ((this.f6004j == profile.f6004j) && Intrinsics.areEqual((Object) this.f6005k, (Object) profile.f6005k) && Intrinsics.areEqual((Object) this.f6006l, (Object) profile.f6006l) && Intrinsics.areEqual((Object) this.f6007m, (Object) profile.f6007m) && Intrinsics.areEqual((Object) this.f6008n, (Object) profile.f6008n) && Intrinsics.areEqual((Object) this.f6009o, (Object) profile.f6009o) && Intrinsics.areEqual((Object) this.f6010p, (Object) profile.f6010p) && Intrinsics.areEqual((Object) this.f6011q, (Object) profile.f6011q) && Intrinsics.areEqual((Object) this.r, (Object) profile.r) && Intrinsics.areEqual((Object) this.s, (Object) profile.s) && Intrinsics.areEqual((Object) this.t, (Object) profile.t) && Intrinsics.areEqual((Object) this.u, (Object) profile.u) && Intrinsics.areEqual((Object) this.v, (Object) profile.v) && Intrinsics.areEqual((Object) this.w, (Object) profile.w) && Intrinsics.areEqual((Object) this.x, (Object) profile.x) && Intrinsics.areEqual((Object) this.y, (Object) profile.y) && Intrinsics.areEqual((Object) this.z, (Object) profile.z) && Intrinsics.areEqual((Object) this.A, (Object) profile.A)) {
                            if (this.B == profile.B) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<String> f() {
        return this.x;
    }

    public final Calendar g() {
        return this.u;
    }

    public final String h() {
        return this.t;
    }

    public int hashCode() {
        String str = this.e;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z2 = this.f6001g;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode2 + (z2 ? 1 : 0)) * 31;
        String str3 = this.f6002h;
        int hashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f6003i;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f6004j) * 31;
        String str5 = this.f6005k;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f6006l;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        SupportedRole supportedRole = this.f6007m;
        int hashCode7 = (hashCode6 + (supportedRole != null ? supportedRole.hashCode() : 0)) * 31;
        String str7 = this.f6008n;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f6009o;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f6010p;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f6011q;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.r;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.s;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.t;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Calendar calendar = this.u;
        int hashCode15 = (hashCode14 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str14 = this.v;
        int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.w;
        int hashCode17 = (hashCode16 + (str15 != null ? str15.hashCode() : 0)) * 31;
        List<String> list = this.x;
        int hashCode18 = (hashCode17 + (list != null ? list.hashCode() : 0)) * 31;
        Calendar calendar2 = this.y;
        int hashCode19 = (hashCode18 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String str16 = this.z;
        int hashCode20 = (hashCode19 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.A;
        if (str17 != null) {
            i2 = str17.hashCode();
        }
        int i4 = (hashCode20 + i2) * 31;
        boolean z3 = this.B;
        if (z3) {
            z3 = true;
        }
        return i4 + (z3 ? 1 : 0);
    }

    public final Calendar i() {
        return this.y;
    }

    public final boolean j() {
        return this.B;
    }

    public final int k() {
        return this.f6004j;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.c;
    }

    public final String n() {
        return this.f6009o;
    }

    public final String o() {
        return this.f6008n;
    }

    public final String p() {
        return this.f6011q;
    }

    public final String q() {
        return this.f6010p;
    }

    public final String r() {
        return this.w;
    }

    public final String s() {
        return this.A;
    }

    public final String t() {
        return this.v;
    }

    public String toString() {
        StringBuilder a2 = a.a("Profile(userName=");
        a2.append(this.e);
        a2.append(", fullName=");
        a2.append(this.f);
        a2.append(", active=");
        a2.append(this.f6001g);
        a2.append(", accessToken=");
        a2.append(this.f6002h);
        a2.append(", tokenType=");
        a2.append(this.f6003i);
        a2.append(", expiresIn=");
        a2.append(this.f6004j);
        a2.append(", refreshToken=");
        a2.append(this.f6005k);
        a2.append(", studentName=");
        a2.append(this.f6006l);
        a2.append(", role=");
        a2.append(this.f6007m);
        a2.append(", instituteName=");
        a2.append(this.f6008n);
        a2.append(", instituteCode=");
        a2.append(this.f6009o);
        a2.append(", instituteUserId=");
        a2.append(this.f6010p);
        a2.append(", instituteUrl=");
        a2.append(this.f6011q);
        a2.append(", studentId=");
        a2.append(this.r);
        a2.append(", schoolYearId=");
        a2.append(this.s);
        a2.append(", birthName=");
        a2.append(this.t);
        a2.append(", birthDate=");
        a2.append(this.u);
        a2.append(", placeOfBirth=");
        a2.append(this.v);
        a2.append(", mothersName=");
        a2.append(this.w);
        a2.append(", address=");
        a2.append(this.x);
        a2.append(", creationTime=");
        a2.append(this.y);
        a2.append(", subNumber=");
        a2.append(this.z);
        a2.append(", password=");
        a2.append(this.A);
        a2.append(", eAdministrationIsActive=");
        a2.append(this.B);
        a2.append(")");
        return a2.toString();
    }

    public final String u() {
        return this.f6005k;
    }

    public final SupportedRole v() {
        return this.f6007m;
    }

    public final int w() {
        int i2 = WhenMappings.f6012a[this.f6007m.ordinal()];
        if (i2 == 1) {
            return R.string.ActiveProfile_Role_Student;
        }
        if (i2 != 2) {
            return 0;
        }
        return R.string.ActiveProfile_Role_Tutelary;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f6001g ? 1 : 0);
        parcel.writeString(this.f6002h);
        parcel.writeString(this.f6003i);
        parcel.writeInt(this.f6004j);
        parcel.writeString(this.f6005k);
        parcel.writeString(this.f6006l);
        parcel.writeString(this.f6007m.name());
        parcel.writeString(this.f6008n);
        parcel.writeString(this.f6009o);
        parcel.writeString(this.f6010p);
        parcel.writeString(this.f6011q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeSerializable(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeStringList(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B ? 1 : 0);
    }

    public final String x() {
        return this.s;
    }

    public final String y() {
        return this.r;
    }

    public final String z() {
        return this.f6006l;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Profile(java.lang.String r27, java.lang.String r28, boolean r29, java.lang.String r30, java.lang.String r31, int r32, java.lang.String r33, java.lang.String r34, hu.ekreta.ellenorzo.authentication.SupportedRole r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.Calendar r43, java.lang.String r44, java.lang.String r45, java.util.List r46, java.util.Calendar r47, java.lang.String r48, java.lang.String r49, boolean r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            r26 = this;
            r0 = r51 & 4
            if (r0 == 0) goto L_0x0007
            r0 = 0
            r4 = 0
            goto L_0x0009
        L_0x0007:
            r4 = r29
        L_0x0009:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r51 & r0
            if (r0 == 0) goto L_0x001b
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.lang.String r1 = "Calendar.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r22 = r0
            goto L_0x001d
        L_0x001b:
            r22 = r47
        L_0x001d:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r51 & r0
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = ""
            r23 = r0
            goto L_0x002a
        L_0x0028:
            r23 = r48
        L_0x002a:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r51 & r0
            if (r0 == 0) goto L_0x0034
            r0 = 0
            r24 = r0
            goto L_0x0036
        L_0x0034:
            r24 = r49
        L_0x0036:
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r21 = r46
            r25 = r50
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.profile.Profile.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.authentication.SupportedRole, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Calendar, java.lang.String, java.lang.String, java.util.List, java.util.Calendar, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
