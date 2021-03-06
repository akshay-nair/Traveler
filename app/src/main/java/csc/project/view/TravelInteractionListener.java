package csc.project.view;

import csc.travel.SingleTravel;

/**
 * This interface must be implemented by activities that contain this fragment
 * to allow an interaction in this fragment to be communicated to the activity
 * and potentially other fragments contained in that activity.
 * <p/>
 * See the Android Training lesson <a href=
 * "http://developer.android.com/training/basics/fragments/communicating.html" >
 * Communicating with Other Fragments</a> for more information.
 */
public interface TravelInteractionListener {
  /**
   * The action to take when a user selects an item from the list.
   * 
   * @param item
   *          the item that was selected
   */
  public void onInteraction(SingleTravel item);
}