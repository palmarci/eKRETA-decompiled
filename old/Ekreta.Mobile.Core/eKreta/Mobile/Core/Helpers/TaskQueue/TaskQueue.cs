// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.TaskQueue.TaskQueue
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Helpers.TaskQueue
{
  public class TaskQueue
  {
    private SemaphoreSlim semaphore = new SemaphoreSlim(1);

    public TimeSpan TimeBetweenTaskExecutions { get; set; }

    public int NumberOfRetries { get; set; }

    public async Task<T> Enqueue<T>(Func<Task<T>> taskGenerator)
    {
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      int num1 = (^this).\u003C\u003E1__state;
      T result;
      try
      {
        TaskAwaiter awaiter1 = this.semaphore.WaitAsync().GetAwaiter();
        if (!awaiter1.IsCompleted)
        {
          int num2;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num2 = 0;
          TaskAwaiter taskAwaiter = awaiter1;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, Ekreta.Mobile.Core.Helpers.TaskQueue.TaskQueue.\u003CEnqueue\u003Ed__9<T>>(ref awaiter1, this);
          return;
        }
        awaiter1.GetResult();
        int numberOfRetries = this.NumberOfRetries;
        Task delay = (Task) null;
        try
        {
          ConfiguredTaskAwaitable<T>.ConfiguredTaskAwaiter awaiter2 = TaskUtilities.RetryOnFailure<T>((Func<Task<T>>) (() =>
          {
            delay = Task.Delay(this.TimeBetweenTaskExecutions);
            return taskGenerator();
          }), this.NumberOfRetries, new TimeSpan?(this.TimeBetweenTaskExecutions)).ConfigureAwait(false).GetAwaiter();
          if (!awaiter2.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num1 = 1;
            ConfiguredTaskAwaitable<T>.ConfiguredTaskAwaiter configuredTaskAwaiter = awaiter2;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<ConfiguredTaskAwaitable<T>.ConfiguredTaskAwaiter, Ekreta.Mobile.Core.Helpers.TaskQueue.TaskQueue.\u003CEnqueue\u003Ed__9<T>>(ref awaiter2, this);
            return;
          }
          result = awaiter2.GetResult();
        }
        finally
        {
          if (num1 < 0)
            this.ReleaseAfterDelay(delay);
        }
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public Task Enqueue(Func<Task> taskGenerator)
    {
      return (Task) this.Enqueue<bool>((Func<Task<bool>>) (() => TaskUtilities.WithResult<bool>(taskGenerator(), true)));
    }

    private async void ReleaseAfterDelay(Task delay)
    {
      try
      {
        await delay.ConfigureAwait(false);
      }
      finally
      {
        this.semaphore.Release();
      }
    }
  }
}
