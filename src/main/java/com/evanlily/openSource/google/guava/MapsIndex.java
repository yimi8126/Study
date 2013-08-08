package com.evanlily.openSource.google.guava;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;

import java.util.ArrayList;
import java.util.List;

/**
 * User: 一米
 * Date: 13-7-15
 * Time: 下午5:19
 * Description:
 */
public class MapsIndex {
    public static void main(String[] args) {
        List<People> sList1 = new ArrayList<People>();
        sList1.add(new People("lily", 12L));
        sList1.add(new People("lil6y", 12L));
        sList1.add(new People("lil3y", 14L));
        //return key->List 适用于一个key对应的value有重复
        ImmutableListMultimap<Long,People> index = Multimaps.index(sList1, new Function<People, Long>() {
            @Override
            public Long apply(People from) {
                return from.getId();
            }
        });
        System.out.println(index);
        List<People> sList2 = new ArrayList<People>();
        sList2.add(new People("lily", 12L));
        sList2.add(new People("lil6y", 13L));
        sList2.add(new People("lil3y", 14L));
        //return key--->Object 适合没有重复
        ImmutableMap<Long,People> PeopleImmutableMap = Maps.uniqueIndex(sList2, new Function<People, Long>() {
            @Override
            public Long apply(People from) {
                return from.getId();
            }
        });
        System.out.println(PeopleImmutableMap);

    }

}

