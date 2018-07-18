/**
 * The {@link exercise3.AccountDAO} class provides a very simple interface to
 * store and retrieve accounts by id. You have no details about the actual store
 * engine being used.
 * 
 * It's asked to you to implement an in-memory cache for it.
 * 
 * Some constrains might be considered:
 * 
 * If the last modification for a element retrieved from the cache is greater
 * than 1 hour, it should be reloaded from the DAO.
 * 
 * You cache should have a limited number of elements it can hold - you are free
 * to implement any removal policy you want.
 */
package exercise3;