package p289hu.ekreta.ellenorzo.authentication;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "", "priority", "", "roleName", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getPriority", "()I", "getRoleName", "()Ljava/lang/String;", "Guardian", "Student", "NotSupportedRole", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.SupportedRole */
/* compiled from: SupportedRole.kt */
public enum SupportedRole {
    Guardian(0, "Gondviselo"),
    Student(1, "Tanulo"),
    NotSupportedRole(Integer.MIN_VALUE, "");
    
    public static final Companion Companion = null;

    /* renamed from: g */
    public static final Lazy f11260g = null;

    /* renamed from: c */
    public final int f11261c;

    /* renamed from: e */
    public final String f11262e;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/SupportedRole$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "roleName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.authentication.SupportedRole$Companion */
    /* compiled from: SupportedRole.kt */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ KProperty[] f11263a = null;

        static {
            f11263a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
        }

        public Companion() {
        }

        /* renamed from: a */
        public final SupportedRole mo11569a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "roleName");
            Lazy access$getMap$cp = SupportedRole.f11260g;
            Companion companion = SupportedRole.Companion;
            KProperty kProperty = f11263a[0];
            SupportedRole supportedRole = (SupportedRole) ((Map) access$getMap$cp.getValue()).get(str);
            return supportedRole != null ? supportedRole : SupportedRole.NotSupportedRole;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion(null);
        f11260g = LazyKt__LazyJVMKt.lazy(SupportedRole$Companion$map$2.INSTANCE);
    }

    /* access modifiers changed from: public */
    SupportedRole(int i, String str) {
        this.f11261c = i;
        this.f11262e = str;
    }

    /* renamed from: a */
    public final String mo11567a() {
        return this.f11262e;
    }

    /* renamed from: d */
    public final int mo11568d() {
        return this.f11261c;
    }
}
