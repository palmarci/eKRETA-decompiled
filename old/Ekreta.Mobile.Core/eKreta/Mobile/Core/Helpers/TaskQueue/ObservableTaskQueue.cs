// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.TaskQueue.ObservableTaskQueue
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.ComponentModel;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Helpers.TaskQueue
{
  public class ObservableTaskQueue : INotifyPropertyChanged
  {
    private Ekreta.Mobile.Core.Helpers.TaskQueue.TaskQueue queue = new Ekreta.Mobile.Core.Helpers.TaskQueue.TaskQueue();
    private int tasksQueuedSinceQueueWasLastIdle;
    private int pendingTasks;

    public event Action StartWorking;

    public event Action StopWorking;

    public event PropertyChangedEventHandler PropertyChanged;

    public int Progress
    {
      get
      {
        return this.tasksQueuedSinceQueueWasLastIdle == 0 ? 0 : (this.tasksQueuedSinceQueueWasLastIdle - this.pendingTasks) * 100 / this.tasksQueuedSinceQueueWasLastIdle;
      }
    }

    public TimeSpan TimeBetweenTaskExecutions
    {
      get
      {
        return this.queue.TimeBetweenTaskExecutions;
      }
      set
      {
        this.queue.TimeBetweenTaskExecutions = value;
      }
    }

    public int NumberOfRetries
    {
      get
      {
        return this.queue.NumberOfRetries;
      }
      set
      {
        this.queue.NumberOfRetries = value;
      }
    }

    public async Task<T> Enqueue<T>(Func<Task<T>> taskGenerator)
    {
      Interlocked.Increment(ref this.tasksQueuedSinceQueueWasLastIdle);
      if (Interlocked.Increment(ref this.pendingTasks) == 1)
      {
        Action startWorking = this.StartWorking;
        if (startWorking != null)
          startWorking();
      }
      this.NotifyPropertyChanged("Progress");
      T obj;
      try
      {
        obj = await this.queue.Enqueue<T>(taskGenerator).ConfigureAwait(false);
      }
      finally
      {
        this.NotifyPropertyChanged("Progress");
        if (Interlocked.Decrement(ref this.pendingTasks) == 0)
        {
          Interlocked.Exchange(ref this.tasksQueuedSinceQueueWasLastIdle, 0);
          Action stopWorking = this.StopWorking;
          if (stopWorking != null)
            stopWorking();
        }
      }
      return obj;
    }

    public Task Enqueue(Func<Task> taskGenerator)
    {
      return (Task) this.Enqueue<bool>((Func<Task<bool>>) (() => TaskUtilities.WithResult<bool>(taskGenerator(), true)));
    }

    private void NotifyPropertyChanged(string propertyName)
    {
      PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
      if (propertyChanged == null)
        return;
      propertyChanged((object) this, new PropertyChangedEventArgs(propertyName));
    }
  }
}
