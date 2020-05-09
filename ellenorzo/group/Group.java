package p289hu.ekreta.ellenorzo.group;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0011HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00065"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/group/Group;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "uid", "name", "isActive", "", "type", "educationTypeName", "educationTypeDescription", "educationTypeUid", "classMasterUid", "classMasterAssistantUid", "categoryName", "categoryDescription", "sortIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCategoryDescription", "()Ljava/lang/String;", "getCategoryName", "getClassMasterAssistantUid", "getClassMasterUid", "getEducationTypeDescription", "getEducationTypeName", "getEducationTypeUid", "()Z", "getName", "getProfileId", "getSortIndex", "()I", "getType", "getUid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.Group */
/* compiled from: Group.kt */
public final class Group implements ProfileSpecificModel {

    /* renamed from: c */
    public final String f13293c;

    /* renamed from: e */
    public final String f13294e;

    /* renamed from: f */
    public final String f13295f;

    /* renamed from: g */
    public final boolean f13296g;

    /* renamed from: h */
    public final String f13297h;

    /* renamed from: i */
    public final String f13298i;

    /* renamed from: j */
    public final String f13299j;

    /* renamed from: k */
    public final String f13300k;

    /* renamed from: l */
    public final String f13301l;

    /* renamed from: m */
    public final String f13302m;

    /* renamed from: n */
    public final String f13303n;

    /* renamed from: o */
    public final String f13304o;

    /* renamed from: p */
    public final int f13305p;

    public Group(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "type");
        Intrinsics.checkParameterIsNotNull(str5, "educationTypeName");
        Intrinsics.checkParameterIsNotNull(str6, "educationTypeDescription");
        Intrinsics.checkParameterIsNotNull(str7, "educationTypeUid");
        Intrinsics.checkParameterIsNotNull(str10, "categoryName");
        Intrinsics.checkParameterIsNotNull(str11, "categoryDescription");
        this.f13293c = str;
        this.f13294e = str2;
        this.f13295f = str3;
        this.f13296g = z;
        this.f13297h = str4;
        this.f13298i = str5;
        this.f13299j = str6;
        this.f13300k = str7;
        this.f13301l = str8;
        this.f13302m = str9;
        this.f13303n = str10;
        this.f13304o = str11;
        this.f13305p = i;
    }

    public static /* synthetic */ Group copy$default(Group group, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, Object obj) {
        Group group2 = group;
        int i3 = i2;
        return group.mo12750a((i3 & 1) != 0 ? group.mo11318e() : str, (i3 & 2) != 0 ? group2.f13294e : str2, (i3 & 4) != 0 ? group2.f13295f : str3, (i3 & 8) != 0 ? group2.f13296g : z, (i3 & 16) != 0 ? group2.f13297h : str4, (i3 & 32) != 0 ? group2.f13298i : str5, (i3 & 64) != 0 ? group2.f13299j : str6, (i3 & 128) != 0 ? group2.f13300k : str7, (i3 & 256) != 0 ? group2.f13301l : str8, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? group2.f13302m : str9, (i3 & 1024) != 0 ? group2.f13303n : str10, (i3 & 2048) != 0 ? group2.f13304o : str11, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? group2.f13305p : i);
    }

    /* renamed from: a */
    public final Group mo12750a(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        String str12 = str;
        Intrinsics.checkParameterIsNotNull(str12, "profileId");
        String str13 = str2;
        Intrinsics.checkParameterIsNotNull(str13, "uid");
        String str14 = str3;
        Intrinsics.checkParameterIsNotNull(str14, "name");
        String str15 = str4;
        Intrinsics.checkParameterIsNotNull(str15, "type");
        String str16 = str5;
        Intrinsics.checkParameterIsNotNull(str16, "educationTypeName");
        String str17 = str6;
        Intrinsics.checkParameterIsNotNull(str17, "educationTypeDescription");
        String str18 = str7;
        Intrinsics.checkParameterIsNotNull(str18, "educationTypeUid");
        String str19 = str10;
        Intrinsics.checkParameterIsNotNull(str19, "categoryName");
        String str20 = str11;
        Intrinsics.checkParameterIsNotNull(str20, "categoryDescription");
        Group group = new Group(str12, str13, str14, z, str15, str16, str17, str18, str8, str9, str19, str20, i);
        return group;
    }

    /* renamed from: a */
    public final String mo12751a() {
        return this.f13304o;
    }

    /* renamed from: b */
    public final String mo12752b() {
        return this.f13303n;
    }

    /* renamed from: c */
    public final String mo12753c() {
        return this.f13302m;
    }

    /* renamed from: d */
    public final String mo12754d() {
        return this.f13294e;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f13293c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Group) {
                Group group = (Group) obj;
                if (Intrinsics.areEqual((Object) mo11318e(), (Object) group.mo11318e()) && Intrinsics.areEqual((Object) this.f13294e, (Object) group.f13294e) && Intrinsics.areEqual((Object) this.f13295f, (Object) group.f13295f)) {
                    if ((this.f13296g == group.f13296g) && Intrinsics.areEqual((Object) this.f13297h, (Object) group.f13297h) && Intrinsics.areEqual((Object) this.f13298i, (Object) group.f13298i) && Intrinsics.areEqual((Object) this.f13299j, (Object) group.f13299j) && Intrinsics.areEqual((Object) this.f13300k, (Object) group.f13300k) && Intrinsics.areEqual((Object) this.f13301l, (Object) group.f13301l) && Intrinsics.areEqual((Object) this.f13302m, (Object) group.f13302m) && Intrinsics.areEqual((Object) this.f13303n, (Object) group.f13303n) && Intrinsics.areEqual((Object) this.f13304o, (Object) group.f13304o)) {
                        if (this.f13305p == group.f13305p) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo12756f() {
        return this.f13301l;
    }

    /* renamed from: g */
    public final String mo12757g() {
        return this.f13299j;
    }

    /* renamed from: h */
    public final String mo12758h() {
        return this.f13298i;
    }

    public int hashCode() {
        String e = mo11318e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String str = this.f13294e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13295f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f13296g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.f13297h;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13298i;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13299j;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f13300k;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f13301l;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f13302m;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f13303n;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f13304o;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return ((hashCode10 + i) * 31) + this.f13305p;
    }

    /* renamed from: i */
    public final String mo12760i() {
        return this.f13300k;
    }

    /* renamed from: j */
    public final String mo12761j() {
        return this.f13295f;
    }

    /* renamed from: k */
    public final int mo12762k() {
        return this.f13305p;
    }

    /* renamed from: l */
    public final String mo12763l() {
        return this.f13297h;
    }

    /* renamed from: m */
    public final boolean mo12764m() {
        return this.f13296g;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Group(profileId=");
        a.append(mo11318e());
        a.append(", uid=");
        a.append(this.f13294e);
        a.append(", name=");
        a.append(this.f13295f);
        a.append(", isActive=");
        a.append(this.f13296g);
        a.append(", type=");
        a.append(this.f13297h);
        a.append(", educationTypeName=");
        a.append(this.f13298i);
        a.append(", educationTypeDescription=");
        a.append(this.f13299j);
        a.append(", educationTypeUid=");
        a.append(this.f13300k);
        a.append(", classMasterUid=");
        a.append(this.f13301l);
        a.append(", classMasterAssistantUid=");
        a.append(this.f13302m);
        a.append(", categoryName=");
        a.append(this.f13303n);
        a.append(", categoryDescription=");
        a.append(this.f13304o);
        a.append(", sortIndex=");
        return C0082a.m105a(a, this.f13305p, ")");
    }
}
