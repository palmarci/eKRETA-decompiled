package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.attachment.Attachment;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0002\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J²\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0001¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u0003H\u0016J\u0013\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020\tHÖ\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"¨\u0006I"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "Landroid/os/Parcelable;", "id", "", "requestedAbsenceStart", "Ljava/util/Calendar;", "requestedAbsenceEnd", "decisionDate", "adjudication", "", "justification", "signerId", "needToBeSendDigitally", "", "judgement", "Lhu/ekreta/ellenorzo/cases/subModels/Judgement;", "filedDocumentId", "postState", "Lhu/ekreta/ellenorzo/cases/subModels/PostState;", "attachments", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "applicationMandatoryDocument", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "(Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/cases/subModels/Judgement;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/PostState;Ljava/util/List;Ljava/util/List;)V", "getAdjudication", "()Ljava/lang/String;", "getApplicationMandatoryDocument", "()Ljava/util/List;", "getAttachments", "getDecisionDate", "()Ljava/util/Calendar;", "getFiledDocumentId", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJudgement", "()Lhu/ekreta/ellenorzo/cases/subModels/Judgement;", "getJustification", "getNeedToBeSendDigitally", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPostState", "()Lhu/ekreta/ellenorzo/cases/subModels/PostState;", "getRequestedAbsenceEnd", "getRequestedAbsenceStart", "getSignerId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/cases/subModels/Judgement;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/PostState;Ljava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.Decision */
/* compiled from: Decision.kt */
public final class Decision implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final Integer f11567c;

    /* renamed from: e */
    public final Calendar f11568e;

    /* renamed from: f */
    public final Calendar f11569f;

    /* renamed from: g */
    public final Calendar f11570g;

    /* renamed from: h */
    public final String f11571h;

    /* renamed from: i */
    public final String f11572i;

    /* renamed from: j */
    public final Integer f11573j;

    /* renamed from: k */
    public final Boolean f11574k;

    /* renamed from: l */
    public final Judgement f11575l;

    /* renamed from: m */
    public final String f11576m;

    /* renamed from: n */
    public final PostState f11577n;

    /* renamed from: o */
    public final List<Attachment> f11578o;

    /* renamed from: p */
    public final List<ApplicationMandatoryDocument> f11579p;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.Decision$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Calendar calendar = (Calendar) parcel.readSerializable();
            Calendar calendar2 = (Calendar) parcel.readSerializable();
            Calendar calendar3 = (Calendar) parcel.readSerializable();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            Judgement judgement = parcel.readInt() != 0 ? (Judgement) Judgement.CREATOR.createFromParcel(parcel2) : null;
            String readString3 = parcel.readString();
            PostState postState = parcel.readInt() != 0 ? (PostState) PostState.CREATOR.createFromParcel(parcel2) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Attachment) Attachment.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (true) {
                ArrayList arrayList3 = arrayList;
                if (readInt2 != 0) {
                    arrayList2.add((ApplicationMandatoryDocument) ApplicationMandatoryDocument.CREATOR.createFromParcel(parcel2));
                    readInt2--;
                    arrayList = arrayList3;
                } else {
                    Decision decision = new Decision(valueOf, calendar, calendar2, calendar3, readString, readString2, valueOf2, bool, judgement, readString3, postState, arrayList3, arrayList2);
                    return decision;
                }
            }
        }

        public final Object[] newArray(int i) {
            return new Decision[i];
        }
    }

    public Decision(Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str, String str2, Integer num2, Boolean bool, Judgement judgement, String str3, PostState postState, List<Attachment> list, List<ApplicationMandatoryDocument> list2) {
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        Intrinsics.checkParameterIsNotNull(list2, "applicationMandatoryDocument");
        this.f11567c = num;
        this.f11568e = calendar;
        this.f11569f = calendar2;
        this.f11570g = calendar3;
        this.f11571h = str;
        this.f11572i = str2;
        this.f11573j = num2;
        this.f11574k = bool;
        this.f11575l = judgement;
        this.f11576m = str3;
        this.f11577n = postState;
        this.f11578o = list;
        this.f11579p = list2;
    }

    public static /* synthetic */ Decision copy$default(Decision decision, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str, String str2, Integer num2, Boolean bool, Judgement judgement, String str3, PostState postState, List list, List list2, int i, Object obj) {
        Decision decision2 = decision;
        int i2 = i;
        return decision.mo11945a((i2 & 1) != 0 ? decision2.f11567c : num, (i2 & 2) != 0 ? decision2.f11568e : calendar, (i2 & 4) != 0 ? decision2.f11569f : calendar2, (i2 & 8) != 0 ? decision2.f11570g : calendar3, (i2 & 16) != 0 ? decision2.f11571h : str, (i2 & 32) != 0 ? decision2.f11572i : str2, (i2 & 64) != 0 ? decision2.f11573j : num2, (i2 & 128) != 0 ? decision2.f11574k : bool, (i2 & 256) != 0 ? decision2.f11575l : judgement, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? decision2.f11576m : str3, (i2 & 1024) != 0 ? decision2.f11577n : postState, (i2 & 2048) != 0 ? decision2.f11578o : list, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? decision2.f11579p : list2);
    }

    /* renamed from: a */
    public final Decision mo11945a(Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str, String str2, Integer num2, Boolean bool, Judgement judgement, String str3, PostState postState, List<Attachment> list, List<ApplicationMandatoryDocument> list2) {
        List<Attachment> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "attachments");
        List<ApplicationMandatoryDocument> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "applicationMandatoryDocument");
        Decision decision = new Decision(num, calendar, calendar2, calendar3, str, str2, num2, bool, judgement, str3, postState, list3, list4);
        return decision;
    }

    /* renamed from: d */
    public final String mo11946d() {
        return this.f11571h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List<Attachment> mo11948e() {
        return this.f11578o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f11579p, (java.lang.Object) r3.f11579p) != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x008d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.subModels.Decision
            if (r0 == 0) goto L_0x008b
            hu.ekreta.ellenorzo.cases.subModels.Decision r3 = (p289hu.ekreta.ellenorzo.cases.subModels.Decision) r3
            java.lang.Integer r0 = r2.f11567c
            java.lang.Integer r1 = r3.f11567c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.util.Calendar r0 = r2.f11568e
            java.util.Calendar r1 = r3.f11568e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.util.Calendar r0 = r2.f11569f
            java.util.Calendar r1 = r3.f11569f
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.util.Calendar r0 = r2.f11570g
            java.util.Calendar r1 = r3.f11570g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r2.f11571h
            java.lang.String r1 = r3.f11571h
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r2.f11572i
            java.lang.String r1 = r3.f11572i
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.Integer r0 = r2.f11573j
            java.lang.Integer r1 = r3.f11573j
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.Boolean r0 = r2.f11574k
            java.lang.Boolean r1 = r3.f11574k
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            hu.ekreta.ellenorzo.cases.subModels.Judgement r0 = r2.f11575l
            hu.ekreta.ellenorzo.cases.subModels.Judgement r1 = r3.f11575l
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r2.f11576m
            java.lang.String r1 = r3.f11576m
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            hu.ekreta.ellenorzo.cases.subModels.PostState r0 = r2.f11577n
            hu.ekreta.ellenorzo.cases.subModels.PostState r1 = r3.f11577n
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.util.List<hu.ekreta.ellenorzo.attachment.Attachment> r0 = r2.f11578o
            java.util.List<hu.ekreta.ellenorzo.attachment.Attachment> r1 = r3.f11578o
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x008b
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument> r0 = r2.f11579p
            java.util.List<hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument> r3 = r3.f11579p
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r3 = 0
            return r3
        L_0x008d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.subModels.Decision.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Calendar mo11950f() {
        return this.f11570g;
    }

    /* renamed from: g */
    public final String mo11951g() {
        return this.f11576m;
    }

    /* renamed from: h */
    public final Judgement mo11952h() {
        return this.f11575l;
    }

    public int hashCode() {
        Integer num = this.f11567c;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Calendar calendar = this.f11568e;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f11569f;
        int hashCode3 = (hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f11570g;
        int hashCode4 = (hashCode3 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String str = this.f11571h;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11572i;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.f11573j;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool = this.f11574k;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Judgement judgement = this.f11575l;
        int hashCode9 = (hashCode8 + (judgement != null ? judgement.hashCode() : 0)) * 31;
        String str3 = this.f11576m;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        PostState postState = this.f11577n;
        int hashCode11 = (hashCode10 + (postState != null ? postState.hashCode() : 0)) * 31;
        List<Attachment> list = this.f11578o;
        int hashCode12 = (hashCode11 + (list != null ? list.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocument> list2 = this.f11579p;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode12 + i;
    }

    /* renamed from: i */
    public final String mo11954i() {
        return this.f11572i;
    }

    /* renamed from: j */
    public final Calendar mo11955j() {
        return this.f11569f;
    }

    /* renamed from: k */
    public final Calendar mo11956k() {
        return this.f11568e;
    }

    /* renamed from: l */
    public final Integer mo11957l() {
        return this.f11573j;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Decision(id=");
        a.append(this.f11567c);
        a.append(", requestedAbsenceStart=");
        a.append(this.f11568e);
        a.append(", requestedAbsenceEnd=");
        a.append(this.f11569f);
        a.append(", decisionDate=");
        a.append(this.f11570g);
        a.append(", adjudication=");
        a.append(this.f11571h);
        a.append(", justification=");
        a.append(this.f11572i);
        a.append(", signerId=");
        a.append(this.f11573j);
        a.append(", needToBeSendDigitally=");
        a.append(this.f11574k);
        a.append(", judgement=");
        a.append(this.f11575l);
        a.append(", filedDocumentId=");
        a.append(this.f11576m);
        a.append(", postState=");
        a.append(this.f11577n);
        a.append(", attachments=");
        a.append(this.f11578o);
        a.append(", applicationMandatoryDocument=");
        return C0082a.m108a(a, (List) this.f11579p, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.f11567c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeSerializable(this.f11568e);
        parcel.writeSerializable(this.f11569f);
        parcel.writeSerializable(this.f11570g);
        parcel.writeString(this.f11571h);
        parcel.writeString(this.f11572i);
        Integer num2 = this.f11573j;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f11574k;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Judgement judgement = this.f11575l;
        if (judgement != null) {
            parcel.writeInt(1);
            judgement.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f11576m);
        PostState postState = this.f11577n;
        if (postState != null) {
            parcel.writeInt(1);
            postState.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Attachment> list = this.f11578o;
        parcel.writeInt(list.size());
        for (Attachment writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<ApplicationMandatoryDocument> list2 = this.f11579p;
        parcel.writeInt(list2.size());
        for (ApplicationMandatoryDocument writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
    }

    public /* synthetic */ Decision(Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str, String str2, Integer num2, Boolean bool, Judgement judgement, String str3, PostState postState, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(num, calendar, calendar2, calendar3, str, str2, num2, bool, judgement, str3, postState, (i2 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
