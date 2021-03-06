package in.tosc.digitaloceanapp.fragments;

import static android.support.test.espresso.Espresso.onView;

import static android.support.test.espresso.action.ViewActions.click;


import static in.tosc.digitaloceanapp.matchers.RecyclerViewMatcher.withRecyclerView;

import in.tosc.digitaloceanapp.R;

import static junit.framework.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


public class SelectSizeFragmentTest {

    public FragmentTestRule<SelectSizeFragment> mFragmentTestRule =
            new FragmentTestRule<>(SelectSizeFragment.class);

    @Test
    public void fragmentcanbeinstantiated() {

        // Launch the activity to make the fragment visible

        // Then use Espresso to test the Fragment
        assertNotNull(onView(withRecyclerView(R.id.recyclerView_size)
                .atPosition(0))
                .perform(click()));


    }
    @Before
    public void setUp() throws Exception {
        mFragmentTestRule.launchActivity(null);

    }

}