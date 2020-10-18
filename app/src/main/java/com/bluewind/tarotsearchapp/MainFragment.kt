package com.bluewind.tarotsearchapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.bluewind.tarotsearchapp.databinding.MainFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainFragment : Fragment() {
    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tarotItems = listOf(
            Tarot(
                title = "サンタ",
                numTitle = "1",
                drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_launcher_background)
            ),
            Tarot(
                title = "ツリー",
                numTitle = "1",
                drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_launcher_background)
            ),
            Tarot(
                title = "トナカイ",
                numTitle = "1",
                drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_launcher_background)
            ),
            Tarot(
                title = "プレゼント",
                numTitle = "1",
                drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_launcher_background)
            ),
            Tarot(
                title = "ケーキ",
                numTitle = "1",
                drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_launcher_foreground)
            ),
            Tarot(
                title = "チキン",
                numTitle = "1",
                drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_launcher_background)
            )
        )

        val binding = MainFragmentBinding.inflate(
            inflater,
            container,
            false
        )

        val adapter = TarotViewAdapter()

        binding.apply {
            binding.viewpager.adapter = adapter
            adapter.setItem(tarotItems)
            TabLayoutMediator(
                tabLayout,
                viewpager,
                TabLayoutMediator.TabConfigurationStrategy { tab, position -> }
            ).attach()
        }

        return binding.root
    }
}