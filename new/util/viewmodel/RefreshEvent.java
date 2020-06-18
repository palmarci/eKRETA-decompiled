package hu.ekreta.ellenorzo.util.viewmodel;

import a.b.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "T", "", "()V", "Error", "LocalData", "RefreshFinished", "RefreshStarted", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$LocalData;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$Error;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshStarted;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshFinished;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RefreshAdapter.kt */
public abstract class RefreshEvent<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$Error;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: RefreshAdapter.kt */
    public static final class Error<T> extends RefreshEvent<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f6338a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(Throwable th) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkParameterIsNotNull(th, "error");
            this.f6338a = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                th = error.f6338a;
            }
            return error.a(th);
        }

        public final Error<T> a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "error");
            return new Error<>(th);
        }

        public final Throwable a() {
            return this.f6338a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Error) && Intrinsics.areEqual((Object) this.f6338a, (Object) ((Error) obj).f6338a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f6338a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a2 = a.a("Error(error=");
            a2.append(this.f6338a);
            a2.append(")");
            return a2.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$LocalData;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$LocalData;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: RefreshAdapter.kt */
    public static final class LocalData<T> extends RefreshEvent<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f6339a;

        public LocalData(T t) {
            super((DefaultConstructorMarker) null);
            this.f6339a = t;
        }

        public static /* synthetic */ LocalData copy$default(LocalData localData, T t, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                t = localData.f6339a;
            }
            return localData.a(t);
        }

        public final LocalData<T> a(T t) {
            return new LocalData<>(t);
        }

        public final T a() {
            return this.f6339a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof LocalData) && Intrinsics.areEqual((Object) this.f6339a, (Object) ((LocalData) obj).f6339a);
            }
            return true;
        }

        public int hashCode() {
            T t = this.f6339a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a2 = a.a("LocalData(data=");
            a2.append(this.f6339a);
            a2.append(")");
            return a2.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshFinished;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "()V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: RefreshAdapter.kt */
    public static final class RefreshFinished<T> extends RefreshEvent<T> {
        public RefreshFinished() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshStarted;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "()V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: RefreshAdapter.kt */
    public static final class RefreshStarted<T> extends RefreshEvent<T> {
        public RefreshStarted() {
            super((DefaultConstructorMarker) null);
        }
    }

    public RefreshEvent() {
    }

    public /* synthetic */ RefreshEvent(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
