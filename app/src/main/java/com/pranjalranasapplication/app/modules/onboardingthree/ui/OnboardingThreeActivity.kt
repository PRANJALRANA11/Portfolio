package com.pranjalranasapplication.app.modules.onboardingthree.ui

import androidx.activity.viewModels
import com.pranjalranasapplication.app.R
import com.pranjalranasapplication.app.appcomponents.base.BaseActivity
import com.pranjalranasapplication.app.databinding.ActivityOnboardingThreeBinding
import com.pranjalranasapplication.app.modules.letsyouin.ui.LetSYouInActivity
import com.pranjalranasapplication.app.modules.onboardingthree.`data`.viewmodel.OnboardingThreeVM
import kotlin.String
import kotlin.Unit

class OnboardingThreeActivity :
    BaseActivity<ActivityOnboardingThreeBinding>(R.layout.activity_onboarding_three) {
  private val viewModel: OnboardingThreeVM by viewModels<OnboardingThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSkip.setOnClickListener {
      val destIntent = LetSYouInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_THREE_ACTIVITY"

  }
}
