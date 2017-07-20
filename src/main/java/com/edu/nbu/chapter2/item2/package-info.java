/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 10:08
 *  
 */
package com.edu.nbu.chapter2.item2;
//遇到多个构造器参数时要考虑采用Builder模式
//通常情况下，constructor有多个参数时，程序猿习惯采用重叠constructor模式；
// 或者采用javabean模式，即提供一个无参constructor，然后通过getter、setter设置参数，
// 但是，使用javaBean可能存在JavaBean处于不一致的状态（无法保证线程安全）