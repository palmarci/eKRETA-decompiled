package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "T", "", "()V", "Error", "LocalData", "RefreshFinished", "RefreshStarted", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$LocalData;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$Error;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshStarted;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshFinished;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent */
/* compiled from: RefreshAdapter.kt */
public abstract class RefreshEvent<T> {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$Error;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$Error */
    /* compiled from: RefreshAdapter.kt */
    public static final class Error<T> extends RefreshEvent<T> {

        /* renamed from: a */
        public final Throwable f15479a;

        public Error(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "error");
            super(null);
            this.f15479a = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.f15479a;
            }
            return error.mo16402a(th);
        }

        /* renamed from: a */
        public final Error<T> mo16402a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "error");
            return new Error<>(th);
        }

        /* renamed from: a */
        public final Throwable mo16403a() {
            return this.f15479a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f15479a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.Error) r2).f15479a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.Error
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$Error r2 = (p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.Error) r2
                java.lang.Throwable r0 = r1.f15479a
                java.lang.Throwable r2 = r2.f15479a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.Error.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Throwable th = this.f15479a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Error(error=");
            a.append(this.f15479a);
            a.append(")");
            return a.toString();
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$LocalData;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$LocalData;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$LocalData */
    /* compiled from: RefreshAdapter.kt */
    public static final class LocalData<T> extends RefreshEvent<T> {

        /* renamed from: a */
        public final T f15480a;

        public LocalData(T t) {
            super(null);
            this.f15480a = t;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=T, for r1v0, types: [java.lang.Object] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData copy$default(p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData r0, T r1, int r2, java.lang.Object r3) {
            /*
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0006
                T r1 = r0.f15480a
            L_0x0006:
                hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$LocalData r0 = r0.mo16407a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData.copy$default(hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$LocalData, java.lang.Object, int, java.lang.Object):hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$LocalData");
        }

        /* renamed from: a */
        public final LocalData<T> mo16407a(T t) {
            return new LocalData<>(t);
        }

        /* renamed from: a */
        public final T mo16408a() {
            return this.f15480a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f15480a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData) r2).f15480a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$LocalData r2 = (p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData) r2
                T r0 = r1.f15480a
                T r2 = r2.f15480a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            T t = this.f15480a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("LocalData(data=");
            a.append(this.f15480a);
            a.append(")");
            return a.toString();
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshFinished;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "()V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$RefreshFinished */
    /* compiled from: RefreshAdapter.kt */
    public static final class RefreshFinished<T> extends RefreshEvent<T> {
        public RefreshFinished() {
            super(null);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent$RefreshStarted;", "T", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "()V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent$RefreshStarted */
    /* compiled from: RefreshAdapter.kt */
    public static final class RefreshStarted<T> extends RefreshEvent<T> {
        public RefreshStarted() {
            super(null);
        }
    }

    public RefreshEvent() {
    }

    public /* synthetic */ RefreshEvent(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
