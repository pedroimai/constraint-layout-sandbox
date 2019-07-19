package br.com.pedroimai.birds

import android.os.Bundle
import android.view.animation.AnticipateOvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.circular_constraint.*

class AnimatedActivity : AppCompatActivity() {

    private var changed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.circular_constraint)
        fab.setOnClickListener { if (!changed) animate() else desanimate() }
    }

    private fun animate() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.circular_constraint_2)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 2000

        TransitionManager.beginDelayedTransition(main_layout)
        constraintSet.applyTo(main_layout)

        changed = true
    }


    private fun desanimate() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, R.layout.circular_constraint)

        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 2000

        TransitionManager.beginDelayedTransition(main_layout, transition)
        constraintSet.applyTo(main_layout)

        changed = false
    }

    private fun desanimateProgramatically() {
        val constraintSet = ConstraintSet()

        constraintSet.connect(
            text_1.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            0
        )

        constraintSet.connect(
            text_1.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT,
            0
        )

        constraintSet.connect(
            text_2.id,
            ConstraintSet.TOP,
            ConstraintSet.PARENT_ID,
            ConstraintSet.TOP,
            0
        )

        constraintSet.connect(
            text_2.id,
            ConstraintSet.RIGHT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.RIGHT,
            0
        )

        constraintSet.connect(
            text_3.id,
            ConstraintSet.BOTTOM,
            ConstraintSet.PARENT_ID,
            ConstraintSet.BOTTOM,
            0
        )

        constraintSet.connect(
            text_3.id,
            ConstraintSet.RIGHT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.RIGHT,
            0
        )

        constraintSet.connect(
            text_4.id,
            ConstraintSet.BOTTOM,
            ConstraintSet.PARENT_ID,
            ConstraintSet.BOTTOM,
            0
        )

        constraintSet.connect(
            text_4.id,
            ConstraintSet.LEFT,
            ConstraintSet.PARENT_ID,
            ConstraintSet.LEFT,
            0
        )


        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 2000

        TransitionManager.beginDelayedTransition(main_layout, transition)
        constraintSet.applyTo(main_layout)
    }

}
