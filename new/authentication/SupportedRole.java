package hu.ekreta.ellenorzo.authentication;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "", "priority", "", "roleName", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getPriority", "()I", "getRoleName", "()Ljava/lang/String;", "Guardian", "Student", "NotSupportedRole", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SupportedRole.kt */
public enum SupportedRole {
    Guardian(0, "Gondviselo"),
    Student(1, "Tanulo"),
    NotSupportedRole(Integer.MIN_VALUE, "");
    
    public static final Companion Companion = null;

    /* renamed from: g  reason: collision with root package name */
    public static final Lazy f5074g = null;
    public final int c;
    public final String e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/SupportedRole$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "roleName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SupportedRole.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f5075a = null;

        static {
            f5075a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
        }

        public Companion() {
        }

        public final SupportedRole a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "roleName");
            Lazy access$getMap$cp = SupportedRole.f5074g;
            Companion companion = SupportedRole.Companion;
            KProperty kProperty = f5075a[0];
            SupportedRole supportedRole = (SupportedRole) ((Map) access$getMap$cp.getValue()).get(str);
            return supportedRole != null ? supportedRole : SupportedRole.NotSupportedRole;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        f5074g = LazyKt__LazyJVMKt.lazy(SupportedRole$Companion$map$2.INSTANCE);
    }

    /* access modifiers changed from: public */
    SupportedRole(int i2, String str) {
        this.c = i2;
        this.e = str;
    }

    public final String a() {
        return this.e;
    }

    public final int d() {
        return this.c;
    }
}
