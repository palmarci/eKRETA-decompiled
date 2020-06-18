// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.TaskQueue.TaskUtilities
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Runtime.ExceptionServices;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Helpers.TaskQueue
{
  public static class TaskUtilities
  {
    public static async Task<T> WithResult<T>(Task task, T value)
    {
      await task.ConfigureAwait(false);
      return (T) value;
    }

    public static async Task<T> RetryOnFailure<T>(
      Func<Task<T>> taskGenerator,
      int numberOfRetries = 1,
      TimeSpan? timeBetweenExecutions = null)
    {
      int numberOfTriesRemaining = numberOfRetries + 1;
      T obj;
      while (true)
      {
        Task delayTask = Task.Delay(timeBetweenExecutions ?? TimeSpan.Zero);
        int num;
        try
        {
          obj = await taskGenerator();
          goto label_13;
        }
        catch (object ex)
        {
          num = 1;
        }
        if (num == 1)
        {
          --numberOfTriesRemaining;
          if (numberOfTriesRemaining == 0)
          {
            if (ex is Exception source)
              ExceptionDispatchInfo.Capture(source).Throw();
            else
              break;
          }
          await delayTask;
        }
        delayTask = (Task) null;
      }
      throw ex;
label_13:
      return obj;
    }
  }
}
