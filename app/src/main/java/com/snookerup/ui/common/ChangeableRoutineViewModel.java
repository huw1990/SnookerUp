package com.snookerup.ui.common;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.snookerup.model.Routine;

/**
 * A view model to handle the common UI components needed to manage the changing of routines, e.g.
 * the routine image and the spinner.
 *
 * @author Huwdunnit
 */
public interface ChangeableRoutineViewModel {

    /**
     * Handle the underlying routine being changed.
     * @param routine The new routine that's been selected
     * @param context The context
     */
    public void setRoutine(Routine routine, Context context);
}
