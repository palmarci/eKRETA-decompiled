package p289hu.ekreta.ellenorzo.profile;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\bG\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0002\u0010 J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0017HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\nHÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u000eHÆ\u0003J\u0002\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001J\t\u0010`\u001a\u00020\nHÖ\u0001J\u0013\u0010a\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010cHÖ\u0003J\t\u0010d\u001a\u00020\nHÖ\u0001J\t\u0010e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0017\u0010/\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b0\u00101\u001a\u0004\b2\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b>\u0010-R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\"R\u0011\u0010B\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bC\u0010\"R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\"R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\"¨\u0006k"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/Profile;", "Landroid/os/Parcelable;", "userName", "", "fullName", "active", "", "accessToken", "tokenType", "expiresIn", "", "refreshToken", "studentName", "role", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "instituteName", "instituteCode", "instituteUserId", "instituteUrl", "studentId", "schoolYearId", "birthName", "birthDate", "Ljava/util/Calendar;", "placeOfBirth", "mothersName", "address", "", "creationTime", "subNumber", "password", "eAdministrationIsActive", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/authentication/SupportedRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccessToken", "()Ljava/lang/String;", "getActive", "()Z", "getAddress", "()Ljava/util/List;", "getBirthDate", "()Ljava/util/Calendar;", "getBirthName", "getCreationTime", "getEAdministrationIsActive", "getExpiresIn", "()I", "getFullName", "id", "id$annotations", "()V", "getId", "getInstituteCode", "getInstituteName", "getInstituteUrl", "getInstituteUserId", "getMothersName", "getPassword", "getPlaceOfBirth", "getRefreshToken", "getRole", "()Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "roleNameRes", "getRoleNameRes", "getSchoolYearId", "getStudentId", "getStudentName", "studentShortName", "getStudentShortName", "getSubNumber", "getTokenType", "getUserName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.Profile */
/* compiled from: Profile.kt */
public final class Profile implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: A */
    public final String f14465A;

    /* renamed from: B */
    public final boolean f14466B;

    /* renamed from: c */
    public final String f14467c;

    /* renamed from: e */
    public final String f14468e;

    /* renamed from: f */
    public final String f14469f;

    /* renamed from: g */
    public final boolean f14470g;

    /* renamed from: h */
    public final String f14471h;

    /* renamed from: i */
    public final String f14472i;

    /* renamed from: j */
    public final int f14473j;

    /* renamed from: k */
    public final String f14474k;

    /* renamed from: l */
    public final String f14475l;

    /* renamed from: m */
    public final SupportedRole f14476m;

    /* renamed from: n */
    public final String f14477n;

    /* renamed from: o */
    public final String f14478o;

    /* renamed from: p */
    public final String f14479p;

    /* renamed from: q */
    public final String f14480q;

    /* renamed from: r */
    public final String f14481r;

    /* renamed from: s */
    public final String f14482s;

    /* renamed from: t */
    public final String f14483t;

    /* renamed from: u */
    public final Calendar f14484u;

    /* renamed from: v */
    public final String f14485v;

    /* renamed from: w */
    public final String f14486w;

    /* renamed from: x */
    public final List<String> f14487x;

    /* renamed from: y */
    public final Calendar f14488y;

    /* renamed from: z */
    public final String f14489z;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.profile.Profile$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Profile profile = new Profile(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (SupportedRole) Enum.valueOf(SupportedRole.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Calendar) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (Calendar) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            return profile;
        }

        public final Object[] newArray(int i) {
            return new Profile[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.profile.Profile$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14490a = new int[SupportedRole.values().length];

        static {
            f14490a[SupportedRole.Student.ordinal()] = 1;
            f14490a[SupportedRole.Guardian.ordinal()] = 2;
        }
    }

    public Profile(String str, String str2, boolean z, String str3, String str4, int i, String str5, String str6, SupportedRole supportedRole, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Calendar calendar, String str14, String str15, List<String> list, Calendar calendar2, String str16, String str17, boolean z2) {
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
        Calendar calendar3 = calendar;
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
        Intrinsics.checkParameterIsNotNull(calendar3, "birthDate");
        Intrinsics.checkParameterIsNotNull(str14, "placeOfBirth");
        Intrinsics.checkParameterIsNotNull(str15, "mothersName");
        Intrinsics.checkParameterIsNotNull(list, "address");
        Intrinsics.checkParameterIsNotNull(calendar2, "creationTime");
        Intrinsics.checkParameterIsNotNull(str16, "subNumber");
        String str32 = str14;
        this.f14468e = str18;
        this.f14469f = str19;
        this.f14470g = z;
        this.f14471h = str20;
        this.f14472i = str21;
        this.f14473j = i;
        this.f14474k = str22;
        this.f14475l = str23;
        this.f14476m = supportedRole2;
        this.f14477n = str24;
        this.f14478o = str25;
        this.f14479p = str26;
        this.f14480q = str27;
        this.f14481r = str28;
        this.f14482s = str29;
        this.f14483t = str30;
        this.f14484u = calendar;
        this.f14485v = str32;
        List<String> list2 = list;
        this.f14486w = str15;
        this.f14487x = list2;
        String str33 = str16;
        this.f14488y = calendar2;
        this.f14489z = str33;
        this.f14465A = str17;
        this.f14466B = z2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14478o);
        sb.append('#');
        sb.append(this.f14479p);
        sb.append('#');
        sb.append(this.f14476m);
        this.f14467c = sb.toString();
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, boolean z, String str3, String str4, int i, String str5, String str6, SupportedRole supportedRole, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Calendar calendar, String str14, String str15, List list, Calendar calendar2, String str16, String str17, boolean z2, int i2, Object obj) {
        Profile profile2 = profile;
        int i3 = i2;
        return profile.mo14041a((i3 & 1) != 0 ? profile2.f14468e : str, (i3 & 2) != 0 ? profile2.f14469f : str2, (i3 & 4) != 0 ? profile2.f14470g : z, (i3 & 8) != 0 ? profile2.f14471h : str3, (i3 & 16) != 0 ? profile2.f14472i : str4, (i3 & 32) != 0 ? profile2.f14473j : i, (i3 & 64) != 0 ? profile2.f14474k : str5, (i3 & 128) != 0 ? profile2.f14475l : str6, (i3 & 256) != 0 ? profile2.f14476m : supportedRole, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? profile2.f14477n : str7, (i3 & 1024) != 0 ? profile2.f14478o : str8, (i3 & 2048) != 0 ? profile2.f14479p : str9, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? profile2.f14480q : str10, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? profile2.f14481r : str11, (i3 & 16384) != 0 ? profile2.f14482s : str12, (i3 & 32768) != 0 ? profile2.f14483t : str13, (i3 & 65536) != 0 ? profile2.f14484u : calendar, (i3 & 131072) != 0 ? profile2.f14485v : str14, (i3 & 262144) != 0 ? profile2.f14486w : str15, (i3 & 524288) != 0 ? profile2.f14487x : list, (i3 & 1048576) != 0 ? profile2.f14488y : calendar2, (i3 & 2097152) != 0 ? profile2.f14489z : str16, (i3 & 4194304) != 0 ? profile2.f14465A : str17, (i3 & 8388608) != 0 ? profile2.f14466B : z2);
    }

    public static /* synthetic */ void id$annotations() {
    }

    /* renamed from: A */
    public final String mo14037A() {
        String str = "";
        for (String str2 : StringsKt__StringsKt.split$default((CharSequence) this.f14475l, new char[]{' '}, false, 0, 6, (Object) null)) {
            StringBuilder a = C0082a.m111a(str);
            a.append(Character.toUpperCase(StringsKt___StringsKt.first(str2)));
            str = a.toString();
        }
        return str;
    }

    /* renamed from: B */
    public final String mo14038B() {
        return this.f14489z;
    }

    /* renamed from: C */
    public final String mo14039C() {
        return this.f14472i;
    }

    /* renamed from: D */
    public final String mo14040D() {
        return this.f14468e;
    }

    /* renamed from: a */
    public final Profile mo14041a(String str, String str2, boolean z, String str3, String str4, int i, String str5, String str6, SupportedRole supportedRole, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Calendar calendar, String str14, String str15, List<String> list, Calendar calendar2, String str16, String str17, boolean z2) {
        String str18 = str;
        String str19 = str2;
        boolean z3 = z;
        String str20 = str3;
        String str21 = str4;
        int i2 = i;
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
        Calendar calendar3 = calendar;
        String str31 = str14;
        String str32 = str15;
        List<String> list2 = list;
        Calendar calendar4 = calendar2;
        String str33 = str16;
        String str34 = str17;
        boolean z4 = z2;
        String str35 = str18;
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
        Profile profile = new Profile(str35, str19, z3, str20, str21, i2, str22, str23, supportedRole2, str24, str25, str26, str27, str28, str29, str30, calendar3, str31, str32, list2, calendar4, str33, str34, z4);
        return profile;
    }

    /* renamed from: d */
    public final String mo14042d() {
        return this.f14471h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo14044e() {
        return this.f14470g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Profile) {
                Profile profile = (Profile) obj;
                if (Intrinsics.areEqual((Object) this.f14468e, (Object) profile.f14468e) && Intrinsics.areEqual((Object) this.f14469f, (Object) profile.f14469f)) {
                    if ((this.f14470g == profile.f14470g) && Intrinsics.areEqual((Object) this.f14471h, (Object) profile.f14471h) && Intrinsics.areEqual((Object) this.f14472i, (Object) profile.f14472i)) {
                        if ((this.f14473j == profile.f14473j) && Intrinsics.areEqual((Object) this.f14474k, (Object) profile.f14474k) && Intrinsics.areEqual((Object) this.f14475l, (Object) profile.f14475l) && Intrinsics.areEqual((Object) this.f14476m, (Object) profile.f14476m) && Intrinsics.areEqual((Object) this.f14477n, (Object) profile.f14477n) && Intrinsics.areEqual((Object) this.f14478o, (Object) profile.f14478o) && Intrinsics.areEqual((Object) this.f14479p, (Object) profile.f14479p) && Intrinsics.areEqual((Object) this.f14480q, (Object) profile.f14480q) && Intrinsics.areEqual((Object) this.f14481r, (Object) profile.f14481r) && Intrinsics.areEqual((Object) this.f14482s, (Object) profile.f14482s) && Intrinsics.areEqual((Object) this.f14483t, (Object) profile.f14483t) && Intrinsics.areEqual((Object) this.f14484u, (Object) profile.f14484u) && Intrinsics.areEqual((Object) this.f14485v, (Object) profile.f14485v) && Intrinsics.areEqual((Object) this.f14486w, (Object) profile.f14486w) && Intrinsics.areEqual((Object) this.f14487x, (Object) profile.f14487x) && Intrinsics.areEqual((Object) this.f14488y, (Object) profile.f14488y) && Intrinsics.areEqual((Object) this.f14489z, (Object) profile.f14489z) && Intrinsics.areEqual((Object) this.f14465A, (Object) profile.f14465A)) {
                            if (this.f14466B == profile.f14466B) {
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

    /* renamed from: f */
    public final List<String> mo14046f() {
        return this.f14487x;
    }

    /* renamed from: g */
    public final Calendar mo14047g() {
        return this.f14484u;
    }

    /* renamed from: h */
    public final String mo14048h() {
        return this.f14483t;
    }

    public int hashCode() {
        String str = this.f14468e;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14469f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f14470g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.f14471h;
        int hashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14472i;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f14473j) * 31;
        String str5 = this.f14474k;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f14475l;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        SupportedRole supportedRole = this.f14476m;
        int hashCode7 = (hashCode6 + (supportedRole != null ? supportedRole.hashCode() : 0)) * 31;
        String str7 = this.f14477n;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f14478o;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f14479p;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f14480q;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f14481r;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f14482s;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f14483t;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Calendar calendar = this.f14484u;
        int hashCode15 = (hashCode14 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str14 = this.f14485v;
        int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f14486w;
        int hashCode17 = (hashCode16 + (str15 != null ? str15.hashCode() : 0)) * 31;
        List<String> list = this.f14487x;
        int hashCode18 = (hashCode17 + (list != null ? list.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f14488y;
        int hashCode19 = (hashCode18 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        String str16 = this.f14489z;
        int hashCode20 = (hashCode19 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f14465A;
        if (str17 != null) {
            i = str17.hashCode();
        }
        int i3 = (hashCode20 + i) * 31;
        boolean z2 = this.f14466B;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final Calendar mo14050i() {
        return this.f14488y;
    }

    /* renamed from: j */
    public final boolean mo14051j() {
        return this.f14466B;
    }

    /* renamed from: k */
    public final int mo14052k() {
        return this.f14473j;
    }

    /* renamed from: l */
    public final String mo14053l() {
        return this.f14469f;
    }

    /* renamed from: m */
    public final String mo14054m() {
        return this.f14467c;
    }

    /* renamed from: n */
    public final String mo14055n() {
        return this.f14478o;
    }

    /* renamed from: o */
    public final String mo14056o() {
        return this.f14477n;
    }

    /* renamed from: p */
    public final String mo14057p() {
        return this.f14480q;
    }

    /* renamed from: q */
    public final String mo14058q() {
        return this.f14479p;
    }

    /* renamed from: r */
    public final String mo14059r() {
        return this.f14486w;
    }

    /* renamed from: s */
    public final String mo14060s() {
        return this.f14465A;
    }

    /* renamed from: t */
    public final String mo14061t() {
        return this.f14485v;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Profile(userName=");
        a.append(this.f14468e);
        a.append(", fullName=");
        a.append(this.f14469f);
        a.append(", active=");
        a.append(this.f14470g);
        a.append(", accessToken=");
        a.append(this.f14471h);
        a.append(", tokenType=");
        a.append(this.f14472i);
        a.append(", expiresIn=");
        a.append(this.f14473j);
        a.append(", refreshToken=");
        a.append(this.f14474k);
        a.append(", studentName=");
        a.append(this.f14475l);
        a.append(", role=");
        a.append(this.f14476m);
        a.append(", instituteName=");
        a.append(this.f14477n);
        a.append(", instituteCode=");
        a.append(this.f14478o);
        a.append(", instituteUserId=");
        a.append(this.f14479p);
        a.append(", instituteUrl=");
        a.append(this.f14480q);
        a.append(", studentId=");
        a.append(this.f14481r);
        a.append(", schoolYearId=");
        a.append(this.f14482s);
        a.append(", birthName=");
        a.append(this.f14483t);
        a.append(", birthDate=");
        a.append(this.f14484u);
        a.append(", placeOfBirth=");
        a.append(this.f14485v);
        a.append(", mothersName=");
        a.append(this.f14486w);
        a.append(", address=");
        a.append(this.f14487x);
        a.append(", creationTime=");
        a.append(this.f14488y);
        a.append(", subNumber=");
        a.append(this.f14489z);
        a.append(", password=");
        a.append(this.f14465A);
        a.append(", eAdministrationIsActive=");
        a.append(this.f14466B);
        a.append(")");
        return a.toString();
    }

    /* renamed from: u */
    public final String mo14063u() {
        return this.f14474k;
    }

    /* renamed from: v */
    public final SupportedRole mo14064v() {
        return this.f14476m;
    }

    /* renamed from: w */
    public final int mo14065w() {
        int i = WhenMappings.f14490a[this.f14476m.ordinal()];
        if (i == 1) {
            return C4014R.string.ActiveProfile_Role_Student;
        }
        if (i != 2) {
            return 0;
        }
        return C4014R.string.ActiveProfile_Role_Tutelary;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f14468e);
        parcel.writeString(this.f14469f);
        parcel.writeInt(this.f14470g ? 1 : 0);
        parcel.writeString(this.f14471h);
        parcel.writeString(this.f14472i);
        parcel.writeInt(this.f14473j);
        parcel.writeString(this.f14474k);
        parcel.writeString(this.f14475l);
        parcel.writeString(this.f14476m.name());
        parcel.writeString(this.f14477n);
        parcel.writeString(this.f14478o);
        parcel.writeString(this.f14479p);
        parcel.writeString(this.f14480q);
        parcel.writeString(this.f14481r);
        parcel.writeString(this.f14482s);
        parcel.writeString(this.f14483t);
        parcel.writeSerializable(this.f14484u);
        parcel.writeString(this.f14485v);
        parcel.writeString(this.f14486w);
        parcel.writeStringList(this.f14487x);
        parcel.writeSerializable(this.f14488y);
        parcel.writeString(this.f14489z);
        parcel.writeString(this.f14465A);
        parcel.writeInt(this.f14466B ? 1 : 0);
    }

    /* renamed from: x */
    public final String mo14067x() {
        return this.f14482s;
    }

    /* renamed from: y */
    public final String mo14068y() {
        return this.f14481r;
    }

    /* renamed from: z */
    public final String mo14069z() {
        return this.f14475l;
    }

    public /* synthetic */ Profile(String str, String str2, boolean z, String str3, String str4, int i, String str5, String str6, SupportedRole supportedRole, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Calendar calendar, String str14, String str15, List list, Calendar calendar2, String str16, String str17, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Calendar calendar3;
        boolean z3 = (i2 & 4) != 0 ? false : z;
        if ((i2 & 1048576) != 0) {
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance()");
            calendar3 = instance;
        } else {
            calendar3 = calendar2;
        }
        this(str, str2, z3, str3, str4, i, str5, str6, supportedRole, str7, str8, str9, str10, str11, str12, str13, calendar, str14, str15, list, calendar3, (i2 & 2097152) != 0 ? "" : str16, (i2 & 4194304) != 0 ? null : str17, z2);
    }
}
