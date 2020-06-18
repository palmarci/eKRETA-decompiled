package hu.ekreta.ellenorzo.homework.comment;

import a.b.a.a.a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, d2 = {"Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "", "uid", "", "recorderStudentName", "recordDate", "Ljava/util/Calendar;", "text", "recorderStudentId", "deletedByStudent", "", "deletedByTeacher", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDeletedByStudent", "()Z", "getDeletedByTeacher", "getRecordDate", "()Ljava/util/Calendar;", "getRecorderStudentId", "()Ljava/lang/String;", "getRecorderStudentName", "getText", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkComment.kt */
public final class HomeworkComment {

    /* renamed from: a  reason: collision with root package name */
    public final String f5685a;
    public final String b;
    public final Calendar c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5686d;
    public final String e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5687g;

    public HomeworkComment(String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "recorderStudentName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, "recorderStudentId");
        this.f5685a = str;
        this.b = str2;
        this.c = calendar;
        this.f5686d = str3;
        this.e = str4;
        this.f = z;
        this.f5687g = z2;
    }

    public static /* synthetic */ HomeworkComment copy$default(HomeworkComment homeworkComment, String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeworkComment.f5685a;
        }
        if ((i2 & 2) != 0) {
            str2 = homeworkComment.b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            calendar = homeworkComment.c;
        }
        Calendar calendar2 = calendar;
        if ((i2 & 8) != 0) {
            str3 = homeworkComment.f5686d;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = homeworkComment.e;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            z = homeworkComment.f;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = homeworkComment.f5687g;
        }
        return homeworkComment.a(str, str5, calendar2, str6, str7, z3, z2);
    }

    public final HomeworkComment a(String str, String str2, Calendar calendar, String str3, String str4, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "recorderStudentName");
        Intrinsics.checkParameterIsNotNull(calendar, "recordDate");
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, "recorderStudentId");
        return new HomeworkComment(str, str2, calendar, str3, str4, z, z2);
    }

    public final boolean a() {
        return this.f;
    }

    public final boolean b() {
        return this.f5687g;
    }

    public final Calendar c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HomeworkComment) {
                HomeworkComment homeworkComment = (HomeworkComment) obj;
                if (Intrinsics.areEqual((Object) this.f5685a, (Object) homeworkComment.f5685a) && Intrinsics.areEqual((Object) this.b, (Object) homeworkComment.b) && Intrinsics.areEqual((Object) this.c, (Object) homeworkComment.c) && Intrinsics.areEqual((Object) this.f5686d, (Object) homeworkComment.f5686d) && Intrinsics.areEqual((Object) this.e, (Object) homeworkComment.e)) {
                    if (this.f == homeworkComment.f) {
                        if (this.f5687g == homeworkComment.f5687g) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f5686d;
    }

    public final String g() {
        return this.f5685a;
    }

    public int hashCode() {
        String str = this.f5685a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Calendar calendar = this.c;
        int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str3 = this.f5686d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i4 = (i3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f5687g;
        if (z2) {
            z2 = true;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder a2 = a.a("HomeworkComment(uid=");
        a2.append(this.f5685a);
        a2.append(", recorderStudentName=");
        a2.append(this.b);
        a2.append(", recordDate=");
        a2.append(this.c);
        a2.append(", text=");
        a2.append(this.f5686d);
        a2.append(", recorderStudentId=");
        a2.append(this.e);
        a2.append(", deletedByStudent=");
        a2.append(this.f);
        a2.append(", deletedByTeacher=");
        a2.append(this.f5687g);
        a2.append(")");
        return a2.toString();
    }
}
