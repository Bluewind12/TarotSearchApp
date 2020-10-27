package com.bluewind.tarotsearchapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.bluewind.tarotsearchapp.databinding.MainFragmentBinding
import com.bluewind.tarotsearchapp.enum.TarotEnum
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {
    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tarotItems = mutableListOf<Tarot>()


        for (tarot in TarotEnum.values()) {
            val tmpTarot = Tarot(
                title = tarot.title,
                num = tarot.num,
                numTitle = tarot.numString,
                uprightInfo = tarot.info,
                reverseInfo = tarot.backInfo,
                drawable = ResourcesCompat.getDrawable(resources, tarot.drawable, null)
            )
            tarotItems.add(tmpTarot)
        }

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
                TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                    tab.text = tarotItems[position].numTitle.toString()
                }
            ).attach()
        }

        return binding.root
    }
}